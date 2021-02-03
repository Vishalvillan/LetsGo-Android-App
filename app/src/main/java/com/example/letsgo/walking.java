package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class walking extends AppCompatActivity {

    TextView tv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walking);
        tv=(TextView)findViewById(R.id.hil);
        tv.setSelected(true);
    }
}