package com.example.managementlanguageschool.Activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.managementlanguageschool.R;

public class ActivityWaitLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_wait_login);
        waitFunction();
    }

    private void waitFunction() {
        new Thread(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Intent i = new Intent(ActivityWaitLogin.this, ActivityLogin.class);
            startActivity(i);
            finish();
        }).start();

    }

}