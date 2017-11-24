package com.oneday.mvpdemo.ui.splash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

import com.oneday.mvpdemo.MyApp;
import com.oneday.mvpdemo.R;
import com.oneday.mvpdemo.data.DataManager;
import com.oneday.mvpdemo.ui.base.BaseActivity;
import com.oneday.mvpdemo.ui.login.LoginActivity;
import com.oneday.mvpdemo.ui.main.MainActivity;

/**
 * Created by OneDay on 2017/11/22.
 *
 * Splash 界面
 */

public class SplashActivity extends BaseActivity implements SplashMvpView{

    public static Intent getStartIntent(Context context){
        Intent intent = new Intent(context, SplashActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((MyApp)getApplication()).getDataManager();
        SplashPresenter presenter = new SplashPresenter(dataManager);
        presenter.onAttach(this);

        presenter.decideActivity();
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        onBackPressed();
    }

    @Override
    public void openLoginActivity() {
        Intent intent = LoginActivity.getStartIntent(this);
        startActivity(intent);
        onBackPressed();
    }
}
