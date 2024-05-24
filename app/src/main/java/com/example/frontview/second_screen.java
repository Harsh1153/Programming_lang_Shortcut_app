package com.example.frontview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class second_screen extends AppCompatActivity implements View.OnClickListener {
    public Button screen_java, screen_python, screen_cp, screen_cplus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        screen_java = findViewById(R.id.button1);
        screen_python = findViewById(R.id.button2);
        screen_cp = findViewById(R.id.button3);
        screen_cplus = findViewById(R.id.button4);

        screen_java.setOnClickListener(this);
        screen_python.setOnClickListener(this);
        screen_cp.setOnClickListener(this);
        screen_cplus.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent i;

        switch (view.getId()) {
            case R.id.button1:
                i = new Intent(this, java_keys.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.button2:
                i = new Intent(this, python_keys.class);
                startActivity(i);
                break;

        }
        switch (view.getId()) {
            case R.id.button3:
                i = new Intent(this, cp_keys.class);
                startActivity(i);
                break;
        }
        switch (view.getId()) {
            case R.id.button4:
                i = new Intent(this, cplus_keys.class);
                startActivity(i);
                break;
        }
    }
}