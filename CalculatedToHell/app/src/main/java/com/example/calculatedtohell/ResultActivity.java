package com.example.calculatedtohell;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle arguments = getIntent().getExtras();
        String res = arguments.get("answer").toString();

        TextView counterView = findViewById(R.id.txtResult);
        counterView.setText(res);
    }
}