package com.oneday.mvpdemo;

import android.app.Application;

import com.oneday.mvpdemo.data.DataManager;
import com.oneday.mvpdemo.data.SharedPrefsHelper;

/**
 * Created by OneDay on 2017/11/22.
 */

public class MyApp extends Application {

    DataManager dataManager;

    @Override
    public void onCreate() {
        super.onCreate();

        dataManager = new DataManager(new SharedPrefsHelper(getApplicationContext()));
    }

    public DataManager getDataManager(){
        return dataManager;
    }
}
