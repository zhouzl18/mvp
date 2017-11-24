package com.oneday.mvpdemo.ui.login;

import com.oneday.mvpdemo.data.DataManager;
import com.oneday.mvpdemo.ui.base.BasePresenter;

/**
 * Created by OneDay on 2017/11/22.
 *
 * login presenter
 */

public class LoginPresenter<V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V> {


    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void startLogin(String emailId) {
        getDataManager().saveEmailId(emailId);
        getDataManager().setLoggedIn();
        getMvpView().openMainActivity();
    }
}
