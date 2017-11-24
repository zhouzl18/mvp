package com.oneday.mvpdemo.ui.splash;

import com.oneday.mvpdemo.data.DataManager;
import com.oneday.mvpdemo.ui.base.BasePresenter;

/**
 * Created by OneDay on 2017/11/22.
 *
 * splash presenter
 */

public class SplashPresenter<V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V> {

    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideActivity() {
        if(getDataManager().getLoggedInMode()){
            getMvpView().openMainActivity();
        }else{
            getMvpView().openLoginActivity();
        }
    }
}
