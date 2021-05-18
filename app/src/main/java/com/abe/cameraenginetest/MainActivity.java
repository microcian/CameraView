package com.abe.cameraenginetest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openUsingKotlin(View view) {
//        startActivity(new Intent(MainActivity.this, CameraActivity.Companion.getClass()));
    }

    public void openUsingJava(View view) {
        startActivity(new Intent(MainActivity.this, CameraActivity.class));
    }
}