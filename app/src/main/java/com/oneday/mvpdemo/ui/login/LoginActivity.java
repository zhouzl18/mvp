package com.oneday.mvpdemo.ui.login;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.oneday.mvpdemo.MyApp;
import com.oneday.mvpdemo.R;
import com.oneday.mvpdemo.data.DataManager;
import com.oneday.mvpdemo.ui.base.BaseActivity;
import com.oneday.mvpdemo.ui.main.MainActivity;
import com.oneday.mvpdemo.util.CommonUtils;

/**
 * Created by OneDay on 2017/11/22.
 *
 * Login Activity
 */

public class LoginActivity extends BaseActivity implements LoginMvpView {

    LoginPresenter<LoginMvpView> loginPresenter;
    EditText etEmail;
    EditText etPwd;

    public static Intent getStartIntent(Context context){
        Intent intent = new Intent(context, LoginActivity.class);
        return intent;
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        DataManager dataManager = ((MyApp)getApplication()).getDataManager();
        loginPresenter = new LoginPresenter<>(dataManager);
        loginPresenter.onAttach(this);

        etEmail = findViewById(R.id.etEmail);
        etPwd = findViewById(R.id.etPwd);

        Button btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onLoginButtonClick();
            }
        });
    }

    @Override
    public void openMainActivity() {
        Intent intent = MainActivity.getStartIntent(this);
        startActivity(intent);
        onBackPressed();
    }

    @Override
    public void onLoginButtonClick() {
        String email = etEmail.getText().toString();
        String pwd = etPwd.getText().toString();

        if(TextUtils.isEmpty(email) || !CommonUtils.isEmailValid(email)){
            Toast.makeText(this, "Enter correct email1", Toast.LENGTH_SHORT).show();
            return;
        }

        if(TextUtils.isEmpty(pwd)){
            Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show();
            return;
        }

        loginPresenter.startLogin(email);
    }
}
