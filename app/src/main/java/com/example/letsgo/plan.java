package com.example.letsgo;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Toast;

public class plan extends AppCompatActivity {

    RecyclerView rcv;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_plan);
        Intent intent=getIntent();
        getSupportActionBar().hide();
        String a=intent.getStringExtra("type");
        rcv=findViewById(R.id.rclview);
        rcv.setLayoutManager(new LinearLayoutManager(this));
        if(a.equals("Chest")) {
            String arr[] = {"Normal Pushups", "Wide Pushups", "Diamond Pushups", "Bench Press", "Dips"};
            int img[] = {R.drawable.normal2, R.drawable.wide1, R.drawable.diamond2, R.drawable.bench, R.drawable.dips2};
            rcv.setAdapter(new adapter(img, arr, plan.this));
        }
        else if(a.equals("Biceps")) {
            String arr[] = {"Concentration Curl", "Standing Dumbell Curl", "Alternate Dumbell Curl", "Hammer Curl", "Barbell Curl"};
            int img[] = {R.drawable.conc1, R.drawable.curl1, R.drawable.alt1, R.drawable.hammer1, R.drawable.barb1};
            rcv.setAdapter(new adapter(img, arr, plan.this));
        }
        else if(a.equals("Legs")) {
            String arr[] = {"Basic squats", "Full squats", "Calf Raises", "Lunges"};
            int img[] = {R.drawable.squat1, R.drawable.full1, R.drawable.calf1, R.drawable.lunges1};
            rcv.setAdapter(new adapter(img, arr, plan.this));
        }
        else if(a.equals("Back")) {
            String arr[] = {"Close Chin-Ups", "Regular Pullups", "Wide Pullupss", "Dumbell Rows", "Barbell Bentover"};
            int img[] = {R.drawable.close1, R.drawable.regular1, R.drawable.widebar1, R.drawable.rows1, R.drawable.bentover1};
            rcv.setAdapter(new adapter(img, arr, plan.this));
        }
        else if(a.equals("Triceps")) {
            String arr[] = {"Diamond Pushups","Pike Pushups", "Tricep Extension Pushups", "Dumbell Overheads","Straight Legs dips","Vertical dips"};
            int img[] = {R.drawable.diamond1, R.drawable.pike1, R.drawable.exten1, R.drawable.overhead1, R.drawable.straight1,R.drawable.tdips};
            rcv.setAdapter(new adapter(img, arr, plan.this));
        }
        else if(a.equals("Abs")) {
            String arr[] = {"Crunches", "Reverse Crunches", "Leg Raises", "Flutter Kicks", "Bicycle Crunches","Plank"};
            int img[] = {R.drawable.crunch1, R.drawable.rev1, R.drawable.raise1, R.drawable.flut1, R.drawable.cycle1,R.drawable.plank1};
            rcv.setAdapter(new adapter(img, arr, plan.this));
        }
    }
    }