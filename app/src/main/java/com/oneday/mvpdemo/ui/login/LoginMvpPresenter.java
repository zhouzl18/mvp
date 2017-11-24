package com.oneday.mvpdemo.ui.login;

import com.oneday.mvpdemo.ui.base.MvpPresenter;

/**
 * Created by OneDay on 2017/11/22.
 *
 * login mvpPresenter
 */

public interface LoginMvpPresenter<V extends LoginMvpView> extends MvpPresenter<V> {

    void startLogin(String emailId);
}
