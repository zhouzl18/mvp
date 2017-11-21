package com.oneday.mvpdemo.ui.base;

/**
 * Created by fengl on 2017-11-21.
 *
 * MvpPresenter
 */

public interface MvpPresenter<V extends MvpView> {

    void onAttach(V mvpView);
}
