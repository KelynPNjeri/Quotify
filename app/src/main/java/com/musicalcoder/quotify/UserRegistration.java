package com.musicalcoder.quotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class UserRegistration extends AppCompatActivity {
    @BindView(R.id.fullname_txt) EditText name;
    @BindView(R.id.email_txt) EditText userEmail;
    @BindView(R.id.password_txt) EditText userPassword;
    @BindView(R.id.confirm_password) EditText confirmPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_registration);

        ButterKnife.bind(this);
    }
}
