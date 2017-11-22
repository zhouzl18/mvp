package com.oneday.mvpdemo.ui.base;

import com.oneday.mvpdemo.data.DataManager;

/**
 * Created by fengl on 2017-11-21.
 */

public class BasePresenter<V extends MvpView> implements MvpPresenter<V> {

    DataManager mDataManager;
    private V mMvpView;

    public BasePresenter(DataManager dataManager) {
        mDataManager = dataManager;
    }

    public DataManager getDataManager(){
        return mDataManager;
    }

    public MvpView getMvpView(){
        return mMvpView;
    }

    @Override
    public void onAttach(V mvpView) {
        mMvpView = mvpView;
    }
}
