package com.example.pals.basicsgkquizzapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashScreenActivity extends AppCompatActivity {
    private static int TIME_OUT= 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(SplashScreenActivity.this , QuizSelectionActivity.class);
                startActivity(i);

                finish();
            }
        },TIME_OUT);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.slide_in_left);
        findViewById(R.id.quiz_img).setAnimation(animation);
    }
}
