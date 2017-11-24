package com.oneday.mvpdemo.ui.login;

import com.oneday.mvpdemo.ui.base.MvpView;

/**
 * Created by OneDay on 2017/11/22.
 *
 * login mvpView;
 */

public interface LoginMvpView extends MvpView {

    void openMainActivity();
    void onLoginButtonClick();
}
