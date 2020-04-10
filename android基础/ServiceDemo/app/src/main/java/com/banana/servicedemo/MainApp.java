package com.banana.servicedemo;

import android.app.Application;

import timber.log.Timber;

/**
 * Created by bobsha on 2019/6/1.
 */
public class MainApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        UmengCrashHandler.getInstance().init(this);
        Timber.plant(new Timber.DebugTree());
    }
}
