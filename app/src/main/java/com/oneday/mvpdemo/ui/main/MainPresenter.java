package com.oneday.mvpdemo.ui.main;

import com.oneday.mvpdemo.data.DataManager;
import com.oneday.mvpdemo.ui.base.BasePresenter;

/**
 * Created by OneDay on 2017/11/22.
 *
 * Presenter: main
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public String getEmailId() {
        return getDataManager().getEmailId();
    }

    @Override
    public void setUserLoggedOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}
