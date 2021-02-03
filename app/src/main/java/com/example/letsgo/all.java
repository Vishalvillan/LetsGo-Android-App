package com.example.letsgo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class all extends AppCompatActivity  {
    private DrawerLayout drawerLayout;
    private ActionBarDrawerToggle toggle;
    Button btnlets;
    Button btndiet;
    TextView tv1,tv2,tv3,tv4,tv5,tv6;
    ImageView im1,im2,im3,im4,im5,im6;
    Animation bounce_anim;
    Button btnwork;
    Button btnplan;
    Button letsgo;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all);
        drawerLayout=(DrawerLayout)findViewById(R.id.drawer);
        toggle=new ActionBarDrawerToggle(this,drawerLayout,R.string.Open,R.string.Close);
        drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        btnlets=findViewById(R.id.press);
        btndiet=findViewById(R.id.diet);
        btnwork=findViewById(R.id.work);
        btnplan=findViewById(R.id.plan);
        letsgo=findViewById(R.id.press);
        letsgo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all.this,textmove.class);
                startActivity(intent);
            }
        });
        Intent intent=getIntent();
        final String a=intent.getStringExtra("type");
        btndiet.setOnClickListener(new View.OnClickListener() {
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
        });
        btnwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(a.equals("Aerobics")){
                    Intent intent=new Intent(all.this,plan.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Strength")){
                    Intent intent=new Intent(all.this,plan.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Flexibility")){
                    Intent intent=new Intent(all.this,plan.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
                if(a.equals("Calisthenics")){
                    Intent intent=new Intent(all.this,plan.class);
                    intent.putExtra("type",a);
                    startActivity(intent);
                }
            }
        });
        btnplan.setOnClickListener(new View.OnClickListener() {
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
                Intent intent=new Intent(all.this,watch.class);
                startActivity(intent);
            }
        });
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all.this,watch.class);
                startActivity(intent);
            }
        });

        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all.this,watch.class);
                startActivity(intent);
            }
        });

        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all.this,watch.class);
                startActivity(intent);
            }
        });

        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all.this,watch.class);
                startActivity(intent);
            }
        });
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(all.this,watch.class);
                startActivity(intent);
            }
        });


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (toggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}