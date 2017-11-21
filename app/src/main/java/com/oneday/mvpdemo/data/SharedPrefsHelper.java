package com.oneday.mvpdemo.data;

import android.content.SharedPreferences;

/**
 * Created by OneDay on 2017/11/21.
 *
 * 数据helper
 */

public class SharedPrefsHelper {

    public static final String MY_PREF = "MY_PREF";
    public static final String EMAIL = "EMAIL";
    public static final String IS_LOGGED_IN = "IS_LOGGED_IN";

    SharedPreferences mSharedPref;

    public SharedPrefsHelper(SharedPreferences mSharedPref) {
        this.mSharedPref = mSharedPref;
    }

    public void clear(){
        mSharedPref.edit().clear().apply();
    }

    public void putEmail(String email){
        mSharedPref.edit().putString(EMAIL, email).apply();
    }

    public String getEmail(){
        return mSharedPref.getString(EMAIL, null);
    }

    public void putLoggedIn(boolean isLoggedIn){
        mSharedPref.edit().putBoolean(IS_LOGGED_IN, isLoggedIn).apply();
    }

    public boolean getLoggedIn(){
        return mSharedPref.getBoolean(IS_LOGGED_IN, false);
    }
}
