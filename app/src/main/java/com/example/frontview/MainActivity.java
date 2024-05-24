package com.example.frontview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private static int timer = 4000;
    ImageView imageView;
    Animation downword_motion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);



        downword_motion = AnimationUtils.loadAnimation(this,R.anim.downword_motion);

        imageView.setAnimation(downword_motion);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,second_screen.class);
                startActivity(intent);
                finish();
            }
        },timer);


    }
}


