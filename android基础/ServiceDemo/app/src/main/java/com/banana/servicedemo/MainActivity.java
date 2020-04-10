package com.banana.servicedemo;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

import timber.log.Timber;


public class MainActivity extends AppCompatActivity {
    final String TAG = this.getClass().getName();
    ServiceConnection mServiceConnection = null;
    ServiceConnection mServiceConnection1 = null;
    Button start_b;
    ViewPager2 viewPager;
    ArrayList<View> views = new ArrayList<>();
    ArrayList<View> viewPagers = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate");
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        viewPager = findViewById(R.id.viewPager);
//        viewPager.setAdapter();
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        Button start_service = findViewById(R.id.start_service);
        Button bind_service = findViewById(R.id.bind_service);
        Button unbind_service = findViewById(R.id.unbind_service);
        Button stop_service = findViewById(R.id.stop_service);
        start_b = findViewById(R.id.start_b);
        final IfSwitchCompareObj ifSwitchCompareObj = new IfSwitchCompareObj();
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ifSwitchCompareObj.startIfTest();
//
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
            }
        });
        start_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "startService click");
                ifSwitchCompareObj.startSwitchTest();
//                startService(new Intent(MainActivity.this, DemoService.class));
            }
        });
        bind_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "bind_service click");
                if (mServiceConnection == null) {
                    mServiceConnection = new ServiceConnection() {
                        @Override
                        public void onServiceConnected(ComponentName name, IBinder service) {
                            Log.e(TAG, "onServiceConnected");
                        }

                        @Override
                        public void onServiceDisconnected(ComponentName name) {
                            Log.e(TAG, "onServiceDisconnected");
                        }
                    };
                    bindService(new Intent(MainActivity.this, DemoService.class), mServiceConnection, Service.BIND_AUTO_CREATE);
                } else {
                    mServiceConnection1 = new ServiceConnection() {
                        @Override
                        public void onServiceConnected(ComponentName name, IBinder service) {
                            Log.e(TAG, "onServiceConnected 1");
                        }

                        @Override
                        public void onServiceDisconnected(ComponentName name) {
                            Log.e(TAG, "onServiceDisconnected 1");
                        }
                    };
//                    bindService(new Intent(MainActivity.this, DemoService.class), mServiceConnection, Service.BIND_AUTO_CREATE);
                    bindService(new Intent(MainActivity.this, DemoService.class), mServiceConnection1, Service.BIND_AUTO_CREATE);
                }
            }
        });
        unbind_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "unbind_service click");
                try {
                    unbindService(mServiceConnection);
                    unbindService(mServiceConnection1);
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                    finish();
                }
            }
        });
        stop_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "stop_service click");
                stopService(new Intent(MainActivity.this, DemoService.class));
            }
        });
        start_b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.e(TAG, "start_b click");
                startActivity(new Intent(MainActivity.this, BActivity.class));
            }
        });
        Log.e(TAG, start_b.getLayoutParams().height + "");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Timber.e("onStart  Timber");
        Log.e(TAG, "onStart");
        Log.e(TAG, start_b.getWidth() + "");
        Log.e(TAG, start_b.getMeasuredWidth() + "");
        start_b.post(new Runnable() {
            @Override
            public void run() {
                Log.e(TAG, start_b.getWidth() + "");
                Log.e(TAG, start_b.getMeasuredWidth() + "");
            }
        });
        new Thread(new Runnable() {
            @Override
            public void run() {
                TestSyncUtil.ins().sleep();
            }
        }).start();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume");
        Log.e(TAG, start_b.getWidth() + "");
        Log.e(TAG, start_b.getMeasuredWidth() + "");
//        start_b.post(new Runnable() {
//            @Override
//            public void run() {
//                Log.e(TAG, start_b.getWidth()+"");
//            }
//        });

        InputMethodManager imm = (InputMethodManager) getSystemService(Context.INPUT_METHOD_SERVICE);
        if (imm != null) {
            Timber.e("showSoftInput ");
            imm.toggleSoftInput(InputMethodManager.SHOW_FORCED, 0);
        } else {
            Timber.e("imm null");
        }


        TestSyncUtil.ins().sleep();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy");
    }
}
