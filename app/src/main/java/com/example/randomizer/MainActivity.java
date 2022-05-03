package com.example.randomizer;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    double a;
    String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id. editText);

    }

    public void button_click(View view) {

        double a =  (Math.random()* (99 - 1)) + 1;

        String str = Double.toString(a);

        editText.setText(str);


    }
}
