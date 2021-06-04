package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class all2 extends AppCompatActivity {

    Button btnlets;
    Button btndiet;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    ImageView im1,im2,im3,im4,im5,im6;
    Animation bounce_anim;
    Button btnwork;
    Button btngoal;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all2);
        im3=findViewById(R.id.im3);
        btndiet=findViewById(R.id.diet);
        btnwork=findViewById(R.id.plan);
        btngoal=findViewById(R.id.work);
        Intent intent=getIntent();
        final String a=intent.getStringExtra("type");
        btndiet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.equals("Calisthenics and Strength")){
                    Intent intent=new Intent(all2.this,diet.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Yoga  and Aerobics")){
                    Intent intent=new Intent(all2.this,diet.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
            }
        });
        btnwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.equals("Calisthenics and Strength")){
                    Intent intent=new Intent(all2.this,workPlan.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Yoga  and Aerobics")){
                    Intent intent=new Intent(all2.this,workPlan.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
            }
        });
        btngoal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.equals("Calisthenics and Strength")){
                    Intent intent=new Intent(all2.this,inside.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Yoga  and Aerobics")){
                    Intent intent=new Intent(all2.this,inside.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
            }
        });
       /*btnins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.equals("Aerobics")){
                    Intent intent=new Intent(all.this,diet.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Strength")){
                    Intent intent=new Intent(all.this,diet.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Flexibility")){
                    Intent intent=new Intent(all.this,diet.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Calisthenics")){
                    Intent intent=new Intent(all.this,diet.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
            }
        });*/
        tv1=findViewById(R.id.chest);
        tv2=findViewById(R.id.Biceps);
        tv3=findViewById(R.id.Legs);
        tv4=findViewById(R.id.Back);
        tv5=findViewById(R.id.Triceps);
        tv6=findViewById(R.id.Abs);
        im1=findViewById(R.id.im1);
        im2=findViewById(R.id.im2);
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
                YoYo.with(Techniques.Flash).duration(700).repeat(0).playOn(im1);
                Intent intent=new Intent(all2.this,plan.class);
                intent.putExtra("type",tv1.getText().toString());
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im2);
                intent.putExtra("type",tv2.getText().toString());
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im3);
                intent.putExtra("type",tv3.getText().toString());
                startActivity(intent);
            }
        });
        getSupportActionBar().hide();

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im4);
                intent.putExtra("type",tv4.getText().toString());
                startActivity(intent);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im5);
                intent.putExtra("type",tv5.getText().toString());
                startActivity(intent);
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im6);
                intent.putExtra("type",tv6.getText().toString());
                startActivity(intent);
            }
        });
        im1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im1);
            }
        });
        im2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im2);

            }
        });

        im3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im3);

            }
        });

        im4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im4);

            }
        });

        im5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all2.this,plan.class);
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im5);

            }
        });
        im6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                YoYo.with(Techniques.SlideInLeft).duration(700).repeat(0).playOn(im6);

            }
        });
    }
}