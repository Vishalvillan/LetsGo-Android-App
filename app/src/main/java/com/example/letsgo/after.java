package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class after extends AppCompatActivity {
    ImageView img1,img2;
    TextView btns,btna;
    DBHelper DB;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_after);
        img1=findViewById(R.id.tone);
        img2=findViewById(R.id.ttwo);
        YoYo.with(Techniques.Flash).duration(700).repeat(0).playOn(img1);
        YoYo.with(Techniques.Flash).duration(700).repeat(0).playOn(img2);
        btns=findViewById(R.id.one);
        DB=new DBHelper(this);
        btna=findViewById(R.id.two);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Shake).duration(700).repeat(0).playOn(img1);
            }
        });
        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.Shake).duration(700).repeat(0).playOn(img2);
            }
        });
        btns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= btns.getText().toString();
                info harry=new info();
                harry.setType(text);
                String a=harry.getType();
                Toast.makeText(after.this, text+" Selected", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),all2.class);
                intent.putExtra("type",a);
                startActivity(intent);
            }
        });
        btna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text= btna.getText().toString();
                info harry=new info();
                harry.setType(text);
                String a=harry.getType();
                Toast.makeText(after.this, text+" Selected", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),all2.class);
                intent.putExtra("type",a);
                startActivity(intent);
            }
        });
    }
}