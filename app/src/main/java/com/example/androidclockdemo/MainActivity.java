package com.example.androidclockdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AnalogClock;
import android.widget.TextClock;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    AnalogClock analogClock;
    TextClock textClock;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        analogClock = findViewById(R.id.analogClock);
        textClock = findViewById(R.id.textClock);

        analogClock.setOnClickListener(this);
        textClock.setOnClickListener(this);
    }

    public void onClick(View v) {
        if(v.getId() == R.id.analogClock){
            Toast.makeText(this, "Analog Clock", Toast.LENGTH_SHORT).show();
        }
        else if(v.getId() == R.id.textClock){
            Toast.makeText(this, "Text Clock", Toast.LENGTH_SHORT).show();
        }
    }
}
