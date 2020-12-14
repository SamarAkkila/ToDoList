package com.example.todolist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Handler;
import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        Runnable r = new Runnable() {@Override

            public void run() {
                Intent intent = new Intent(SplashActivity.this, CreateAccountActivity.class);
                startActivity(intent);

                SplashActivity.this.finish();
        }
        };
        handler.postDelayed(r, 1500);

    }
}