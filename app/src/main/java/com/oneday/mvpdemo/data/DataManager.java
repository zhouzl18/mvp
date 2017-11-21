package com.oneday.mvpdemo.data;

/**
 * Created by OneDay on 2017/11/21.
 *
 * 通过DataManager与数据交互
 */

public class DataManager {

    SharedPrefsHelper prefsHelper;

    public DataManager(SharedPrefsHelper prefsHelper) {
        this.prefsHelper = prefsHelper;
    }

    public void clear(){
        prefsHelper.clear();
    }

    public void saveEmailId(String email){
        prefsHelper.putEmail(email);
    }

    public String getEmailId(){
        return prefsHelper.getEmail();
    }

    public void saveLoggedIn(boolean isLoggedIn){
        prefsHelper.putLoggedIn(isLoggedIn);
    }

    public boolean getLoggedIn(){
        return prefsHelper.getLoggedIn();
    }
}
