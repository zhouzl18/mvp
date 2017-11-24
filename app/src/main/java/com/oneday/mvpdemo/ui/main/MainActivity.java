package com.oneday.mvpdemo.ui.main;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.oneday.mvpdemo.MyApp;
import com.oneday.mvpdemo.R;
import com.oneday.mvpdemo.data.DataManager;
import com.oneday.mvpdemo.ui.base.BaseActivity;
import com.oneday.mvpdemo.ui.base.MvpPresenter;
import com.oneday.mvpdemo.ui.splash.SplashActivity;

public class MainActivity extends BaseActivity implements MainMvpView {


    public static Intent getStartIntent(Context context){
        Intent intent = new Intent(context, MainActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager dataManager = ((MyApp)getApplication()).getDataManager();
        final MainPresenter<MainMvpView> mainPresenter = new MainPresenter<>(dataManager);
        mainPresenter.onAttach(this);

        TextView tvEmail = findViewById(R.id.tvEmail);
        tvEmail.setText(mainPresenter.getEmailId());

        Button btnLogout = findViewById(R.id.btnLogout);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mainPresenter.setUserLoggedOut();
            }
        });
    }

    @Override
    public void openSplashActivity() {
        Intent intent = SplashActivity.getStartIntent(this);
        startActivity(intent);
        onBackPressed();
    }
}
