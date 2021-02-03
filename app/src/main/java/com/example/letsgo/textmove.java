package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class textmove extends AppCompatActivity {

    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    ImageView im1,im2,im3,im4,im5,im6;
    Animation bounce_anim;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_textmove);
        tv1=findViewById(R.id.chest);
        tv2=findViewById(R.id.Biceps);
        tv3=findViewById(R.id.Legs);
        tv4=findViewById(R.id.Back);
        tv5=findViewById(R.id.Triceps);
        tv6=findViewById(R.id.Abs);
        im1=findViewById(R.id.im1);
        im2=findViewById(R.id.im2);
        im3=findViewById(R.id.im3);
        im4=findViewById(R.id.im4);
        im5=findViewById(R.id.im5);
        im6=findViewById(R.id.im6);
        bounce_anim= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.move);
        tv1.startAnimation(bounce_anim);
        tv2.startAnimation(bounce_anim);
        tv3.startAnimation(bounce_anim);
        tv4.startAnimation(bounce_anim);
        tv5.startAnimation(bounce_anim);
        tv6.startAnimation(bounce_anim);
        im1.startAnimation(bounce_anim);
        im2.startAnimation(bounce_anim);
        im3.startAnimation(bounce_anim);
        im4.startAnimation(bounce_anim);
        im5.startAnimation(bounce_anim);
        im6.startAnimation(bounce_anim);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                finish();
            }
        },100000);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(textmove.this,watch.class);
                startActivity(intent);
            }
        });
    }
}