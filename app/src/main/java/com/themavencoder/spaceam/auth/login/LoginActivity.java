package com.themavencoder.spaceam.auth.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.themavencoder.spaceam.MainActivity;
import com.themavencoder.spaceam.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void signIn(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
