package com.example.footballmatch;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView scoreA, scoreB;
    private Integer counterA = 0, counterB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scoreA = findViewById(R.id.counterA);
        scoreB = findViewById(R.id.counterB);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("counterA", counterA);
        outState.putInt("counterB", counterB);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        if (savedInstanceState != null) {
            if(savedInstanceState.containsKey("counterA"))
                counterA = savedInstanceState.getInt("counterA");

            if(savedInstanceState.containsKey("counterB"))
                counterB = savedInstanceState.getInt("counterB");
        }

        scoreA.setText(counterA.toString());
        scoreB.setText(counterB.toString());
    }

    public void addTeamA(View view) {
        counterA++;

        scoreA.setText(counterA.toString());
    }

    public void addTeamB(View view) {
        counterB++;

        scoreB.setText(counterB.toString());
    }

    public void resetScore(View view) {
        counterA = counterB = 0;

        scoreA.setText("0");
        scoreB.setText("0");
    }
}