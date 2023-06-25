package com.sandeep.androiddeveloper;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        // Intent is used to switch from one activity to another.
        new Handler().postDelayed((Runnable) this::NextActivityFunction, 2000);
    }

    private void NextActivityFunction() {
        Intent i = new Intent(SplashActivity.this, MainActivity.class);
        startActivity(i);// invoke the SecondActivity.
        finish();// the current activity will get finished.
    }
}