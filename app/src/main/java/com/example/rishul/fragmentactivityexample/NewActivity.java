package com.example.rishul.fragmentactivityexample;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class NewActivity extends AppCompatActivity {

    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new);

        tv = findViewById(R.id.textViewNewActivity);
        String s="Text Data Received:-  ";
         s=s+getIntent().getStringExtra("Text_View");
        tv.setText(s.toString());

    }

}