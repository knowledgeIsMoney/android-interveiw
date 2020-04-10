package com.banana.servicedemo;

import android.accounts.NetworkErrorException;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Build;
import android.os.Environment;
import android.util.Log;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.Thread.UncaughtExceptionHandler;
import java.lang.reflect.Field;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by bobsha on 15/4/30.
 */
public class UmengCrashHandler implements UncaughtExceptionHandler {

    public static final String TAG = "UmengCrashHandler";
    private static final int ERROR_STACK = 1;
    private static final int ERROR_ID = 0;
    private static final String TOO_LARGE_IMAGE = "Canvas: trying to draw too large";
    //CrashHandler实例
    private static UmengCrashHandler INSTANCE = new UmengCrashHandler();
    //系统默认的UncaughtException处理类
    private Thread.UncaughtExceptionHandler mDefaultHandler;
    //程序的Context对象
    private Context mContext;
    //用来存储设备信息和异常信息
    private Map<String, String> infos;

    //用于格式化日期,作为日志文件名的一部分
    private DateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
    private File crashDir;

    private UmengCrashHandler() {
    }


    public static UmengCrashHandler getInstance() {
        return INSTANCE;
    }

    /**
     * 初始化
     *
     * @param context
     */
    public void init(Context context) {
        mContext = context;
        getFileDir();
//        reportTooLargeBitmapError();
        //获取系统默认的UncaughtException处理器
        mDefaultHandler = Thread.getDefaultUncaughtExceptionHandler();
        //设置该CrashHandler为程序的默认处理器
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    /**
     * 当UncaughtException发生时会转入该函数来处理
     */
    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        handleException(ex);
//        if (mDefaultHandler != null)  // FIXME: 2017/12/19 系统默认的处理方式为直接退出APP，不符合需求，请勿打开注释
//            mDefaultHandler.uncaughtException(thread, ex);
    }

    /**
     * 自定义错误处理,收集错误信息 发送错误报告等操作均在此完成.
     *
     * @param ex
     * @return true:如果处理了该异常信息;否则返回false.
     */
    private void handleException(final Throwable ex) {
        if (ex == null) {
            return;
        }
        Log.e(TAG, "异常：" + ex.getMessage());
        if ((ex instanceof NetworkErrorException)) {
            Log.e(TAG, "网络层出现异常：" + ex.getMessage());
        }

        if ((ex instanceof NullPointerException)) {
            Log.e(TAG, "空指针异常：" + ex.getMessage());
        }
        //使用Toast来显示异常信息
        if(!BuildConfig.DEBUG) {
            //退出程序
            android.os.Process.killProcess(android.os.Process.myPid());
            System.exit(1);
        }
    }

//    private void handleCrash(Throwable ex) {
//        if (crashDir == null)
//            return;
//        String time = formatter.format(new Date());
//        String[] errorInfo = getErrorInfo(ex);
//        for (File file : crashDir.listFiles()) {
//            if (file.getName().startsWith("crash-" + errorInfo[ERROR_ID]))
//                return;
//        }
//
//        String filePrefix = crashDir.getAbsolutePath() + File.separator + "crash-" + errorInfo[ERROR_ID] + "-" + time;
//        //保存日志文件
//        saveCrashInfo2File(ex, filePrefix + ".log", errorInfo);
//    }

    private void getFileDir() {
        if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED))
            return;
        if (crashDir == null)
            crashDir = new File(mContext.getExternalCacheDir(), "crash");
        if (!crashDir.exists() || !crashDir.isDirectory()) {
            crashDir.delete();
            crashDir.mkdirs();
        }
        if (crashDir == null || !crashDir.exists() || !crashDir.isDirectory())
            crashDir = null;
    }

    /**
     * 获取崩溃信息摘要，摘要相同的崩溃不会重复上传
     *
     * @param ex
     * @return
     */
//    private String[] getErrorInfo(Throwable ex) {
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        PrintWriter printWriter = new PrintWriter(baos);
//        ex.printStackTrace(printWriter);
//        printWriter.close();
//        String errorStack = new String(baos.toByteArray());
//        try {
//            baos.close();
//        } catch (IOException e) {
//            SentryUtil.sendSentryExcepiton(new EventBuilder()
//                    .withMessage("try catch msg")
//                    .withLevel(Event.Level.WARNING)
//                    .withLogger(this.getClass().getName())
//                    .withSentryInterface(new ExceptionInterface(e)));
//
//            LogUtils.e(e);
//        }
//        String error = Build.HARDWARE + ":" + Build.MODEL + ":" + Build.CPU_ABI + ":" + Build.VERSION.SDK_INT +
//                ":" + Build.VERSION.RELEASE + ":" + "\n" + errorStack;
//        String errorId = DigestUtil.stringMD5(error);
//        LogUtils.e("along error " + errorId + "\n" + error);
//        return new String[]{errorId, errorStack};
//    }

    /**
     * 收集设备参数信息
     *
     * @param ctx
     */
    public void collectDeviceInfo(Context ctx) {
        if (infos != null)
            return;
        infos = new HashMap<>();
        try {
            PackageManager pm = ctx.getPackageManager();
            PackageInfo pi = pm.getPackageInfo(ctx.getPackageName(), PackageManager.GET_ACTIVITIES);
            if (pi != null) {
                String versionName = pi.versionName == null ? "null" : pi.versionName;
                String versionCode = pi.versionCode + "";
                infos.put("versionName", versionName);
                infos.put("versionCode", versionCode);
                infos.put("sysVersionCode", Build.VERSION.SDK_INT + "");
                infos.put("sysVersionName", Build.VERSION.RELEASE);
            }
        } catch (NameNotFoundException e) {
        }
        Field[] fields = Build.class.getDeclaredFields();
        for (Field field : fields) {
            try {
                field.setAccessible(true);
                infos.put(field.getName(), field.get(null).toString());
                Log.d(TAG, field.getName() + " : " + field.get(null));
            } catch (Exception e) {
            }
        }
    }

    /**
     * 保存错误信息到文件中
     *
     * @param ex
     * @return 返回文件名称, 便于将文件传送到服务器
     */
    private String saveCrashInfo2File(Throwable ex, String filePath, String[] errorInfo) {
        //收集设备参数信息
        collectDeviceInfo(mContext);
        StringBuffer sb = new StringBuffer();
        sb.append(errorInfo[ERROR_ID] + "\n");
        sb.append(formatter.format(new Date()) + "\n");
        for (Map.Entry<String, String> entry : infos.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            sb.append(key + "=" + value + "\n");
        }
        sb.append(errorInfo[ERROR_STACK]);
        try {
            FileOutputStream fos = new FileOutputStream(filePath);
            fos.write(sb.toString().getBytes());
            fos.close();
            return filePath;
        } catch (Exception e) {
        }
        return null;
    }
}

