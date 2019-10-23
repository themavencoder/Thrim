package com.themavencoder.spaceam.onboarding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.themavencoder.spaceam.R;
import com.themavencoder.spaceam.auth.login.LoginActivity;
import com.themavencoder.spaceam.auth.register.RegisterActivity;

public class DefaultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_default);
    }

    public void register(View view) {
        startActivity(new Intent(this, RegisterActivity.class));
    }

    public void signIn(View view) {
        startActivity(new Intent(this, LoginActivity.class));
    }
}
