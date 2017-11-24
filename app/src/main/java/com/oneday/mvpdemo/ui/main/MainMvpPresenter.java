package com.oneday.mvpdemo.ui.main;

import com.oneday.mvpdemo.ui.base.MvpPresenter;

/**
 * Created by OneDay on 2017/11/22.
 *
 * MvpPresenter: main
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {

    String getEmailId();
    void setUserLoggedOut();
}
