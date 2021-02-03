package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.graphics.Movie;
import android.os.Bundle;
import android.widget.ExpandableListView;

import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class workPlan extends AppCompatActivity {

    ExpandableListView expandableListView;
    ArrayList<String> listgroup=new ArrayList<>();
    HashMap<String,ArrayList<String>> listchild=new HashMap<>();

    MainAdapter2 adapter5;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_plan);
        getSupportActionBar().hide();
        expandableListView=findViewById(R.id.explist);
        for (int g=0;g<=2;g++){
            if(g==0) {
                listgroup.add("Beginner ");
            }
            if(g==1) {
                listgroup.add("Advanced " );
            }
            if(g==2) {
                listgroup.add("Expert ");
            }
            ArrayList<String> arrayList=new ArrayList<>();
            for(int c=g;c<=2;c++)
            {
                if(c==0){//tableu.com>tablue desktop
                arrayList.add("Normal Pushups");
                    arrayList.add("Wide Pushups");
                    arrayList.add("Close Chinups");
                    arrayList.add("Regular Pullups");
                    arrayList.add("Crunches");
                    arrayList.add("Basic Squats");
                    arrayList.add("Flutter Kicks");
                    arrayList.add("Pike Pushups");
                    arrayList.add("Straight Legs Dips");
                    arrayList.add("Standing Dumbell Curl");
                    arrayList.add("Hammer Curl");
                break;}
                if(c==1){
                    arrayList.add("Diamond Pushups");
                    arrayList.add("Plank");
                    arrayList.add("Dumbell Overheads");
                    arrayList.add("Calf Raises");
                    arrayList.add("Full Squats");
                    arrayList.add("Dumbell Rows");
                    arrayList.add("Reverse Crunches");
                    arrayList.add("Leg Raises");
                    arrayList.add("Concentration Curl");
                    arrayList.add("Alternate Dumbell Curl");
                    break;}
                if(c==2){
                    arrayList.add("Bench Press");
                    arrayList.add("Tricep Extension Pushups");
                    arrayList.add("Dips");
                    arrayList.add("Barbell Curl");
                    arrayList.add("Wide Pullups");
                    arrayList.add("Barbell Bentover");
                    arrayList.add("Bicycle Crunches");
                    arrayList.add("Lunges");
                    break;}
            }
            listchild.put(listgroup.get(g),arrayList);
        }
        adapter5=new MainAdapter2(listgroup,listchild,workPlan.this);
        expandableListView.setAdapter(adapter5);
    }



}