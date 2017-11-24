package com.oneday.mvpdemo.ui.splash;

import com.oneday.mvpdemo.ui.base.MvpPresenter;

/**
 * Created by OneDay on 2017/11/22.
 *
 * Splash mvpPresenter
 *
 */

public interface SplashMvpPresenter<V extends SplashMvpView> extends MvpPresenter<V> {

    void decideActivity();
}
