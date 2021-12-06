package com.example.cogent;

import android.annotation.SuppressLint;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;

import com.example.cogent.databinding.ActivitySpashScreenBinding;


public class Spash_screen extends AppCompatActivity {
    private static int SPLASH_SCREEN = 2000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Spash_screen.this,Introduction.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);
    }
}