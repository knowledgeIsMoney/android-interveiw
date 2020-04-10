package com.banana.servicedemo;

import timber.log.Timber;

/**
 * Created by bobsha on 2019-06-26.
 */
public class TestSyncUtil {
    private static TestSyncUtil inst;

    private TestSyncUtil() {
    }

    public static synchronized TestSyncUtil ins() {
        Timber.e("ins in");
        if (inst == null) {
            inst = new TestSyncUtil();
        }
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Timber.e("ins out");
        return inst;
    }

    public synchronized void sleep() {
        Timber.e("sleep in");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Timber.e("sleep out");
    }
}
