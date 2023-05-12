package com.example.calculatedtohell;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText firstValue, secondValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstValue = (EditText) findViewById(R.id.firstValue);
        secondValue = (EditText) findViewById(R.id.secondValue);
    }

    public void onButtonClick(View view) {
        try {
            Integer a = Integer.parseInt(firstValue.getText().toString());
            Integer b = Integer.parseInt(secondValue.getText().toString());

            Integer result = a + b;

            Intent intent = new Intent(this, ResultActivity.class);

            String ansB = b < 0 ? "(" + b + ")" : b.toString();

            intent.putExtra("answer", String.format("%d + %s = %d", a, ansB, result));

            startActivity(intent);
        } catch (Exception ex) {
            Intent intent = new Intent(this, ResultActivity.class);
            intent.putExtra("answer", "Failed to perform addition");
            startActivity(intent);
        }
    }
}