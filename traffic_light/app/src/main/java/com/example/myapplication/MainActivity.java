package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.PorterDuff;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRed(View view) {
        findViewById(android.R.id.content).setBackgroundColor(0xFFFF0000);
    }

    public void onClickOrange(View view) {
        findViewById(android.R.id.content).setBackgroundColor(0xFFFFAA00);
    }

    public void onClickGreen(View view) {
        findViewById(android.R.id.content).setBackgroundColor(0xFF00FF00);
    }
}