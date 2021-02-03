package com.example.letsgo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.TextView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

public class watch extends AppCompatActivity {

    private Chronometer chronometer;
    private boolean running;
    private  long pauseoffset;
    TextView name;
    TextView sets;
    TextView reps;
    Button p1;
    Button p2;
    Button m1;
    Button m2;
    private  int counter,counter2;
    private View.OnClickListener clickListener=new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()){
                case R.id.min1:
                    min1Counter();
                    break;
                case R.id.plus1:
                    plus1Counter();
                    break;
                case R.id.plus2:
                    plus2Counter();
                    break;
                case R.id.min2:
                    min2Counter();
                    break;

            }
        }
    };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch);
        chronometer=findViewById(R.id.chronometer);
        name=findViewById(R.id.name);
        getSupportActionBar().hide();
        sets=findViewById(R.id.sets);
        reps=findViewById(R.id.reps);
        p1=findViewById(R.id.plus1);
        p1.setOnClickListener(clickListener);
        p2=findViewById(R.id.plus2);
        p2.setOnClickListener(clickListener);
        m1=findViewById(R.id.min1);
        m1.setOnClickListener(clickListener);
        m2=findViewById(R.id.min2);
        m2.setOnClickListener(clickListener);
        initCounter();
        Intent intent=getIntent();
        String x=intent.getStringExtra("pu");
        Log.d("xis", "x hai:"+x);
        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModels=new ArrayList<>();
        if (x.equals("Normal Pushups")) {
            name.setText(x);

            slideModels.add(new SlideModel(R.drawable.normal1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.normal2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Diamond Pushups")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.diamond1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.diamond2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Wide Pushups")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.wide1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.wide2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Bench Press")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.bench1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.bench2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }

        else if(x.equals("Dips")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.dips1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.dips2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Basic squats")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.squat1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.squat2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals( "Full squats")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.full1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.full2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Calf Raises")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.calf1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.calf2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Lunges")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.lunges1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.lunges2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Close Chin-Ups")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.close1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.close2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Regular Pullups")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.regular1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.regular2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Wide Pullups")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.widebar1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.widebar2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Dumbell Rows")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.rows1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.rows2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Barbell Bentover")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.bentover1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.bentover2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Pike Pushups")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.pike1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.pike2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Tricep Extension Pushups")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.exten1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.extent2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Dumbell Overheads")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.overhead1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.overhead2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Straight Legs dips")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.straight1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.straight2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Vertical Dips")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.tdips, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.tdips2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Concentration Curl")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.conc1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.conc2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Standing Dumbell Curl")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.curl1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.curl2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        // {"Concentration Curl", "Standing Dumbell Curl", "Alternate Dumbell Curl", "Hammer Curl", "Barbell Curl"
        else if(x.equals("Alternate Dumbell Curl")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.alt1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.alt2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals( "Hammer Curl")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.hammer1,ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.hammer2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals( "Barbell Curl")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.barb1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.barb2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        //"Crunches", "Reverse Crunches", "Leg Raises", "Flutter Kicks", "Bicycle Crunches","Plank"
        else if(x.equals("Crunches")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.crunch1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.crunch2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Reverse Crunches")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.rev1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.rev2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Leg Raises")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.raise1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.raise2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals( "Flutter Kicks")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.flut1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.flut2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals( "Bicycle Crunches")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.cycle1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.cycle2, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        else if(x.equals("Plank")) {
            name.setText(x);
            slideModels.add(new SlideModel(R.drawable.plank1, ScaleTypes.FIT));
            slideModels.add(new SlideModel(R.drawable.plank1, ScaleTypes.FIT));
            imageSlider.setImageList(slideModels);
        }
        imageSlider.stopSliding();
        chronometer.setFormat("%s");
        chronometer.setBase(SystemClock.elapsedRealtime());
        chronometer.setOnChronometerTickListener(new Chronometer.OnChronometerTickListener() {
            @Override
            public void onChronometerTick(Chronometer chronometer) {
                if((SystemClock.elapsedRealtime()-chronometer.getBase())>=10000){
                    chronometer.setBase(SystemClock.elapsedRealtime());
                    Toast.makeText(watch.this, "Bing!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    private void initCounter() {
        counter=0;
        counter2=0;
        sets.setText("Sets");
        reps.setText("Reps");
    }
    private void plus1Counter(){
        counter++;
        sets.setText(counter+"");
    }
    private void plus2Counter(){
        counter2++;
        reps.setText(counter2+"");
        Log.d("reps", reps.getText().toString());

    }
    private void min1Counter(){
        counter--;
        sets.setText(counter+"");
        if(counter<0)
            sets.setText("Sets");
    }
    private void min2Counter(){
        counter2--;
        reps.setText(counter2+"");
        if(counter2<0)
            reps.setText("Reps");
    }

    public void start(View v)
    {
        if(!running){
            chronometer.setBase(SystemClock.elapsedRealtime()-pauseoffset);
            chronometer.start();
            running=true;
            Intent intent=getIntent();
            String x=intent.getStringExtra("pu");
            ImageSlider imageSlider=findViewById(R.id.slider);
            List<SlideModel> slideModels=new ArrayList<>();
            if (x.equals("Normal Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.normal1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.normal2, ScaleTypes.FIT));
            }
            else if(x.equals("Diamond Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.diamond1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.diamond2, ScaleTypes.FIT));
            }
            else if(x.equals("Wide Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.wide1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.wide2, ScaleTypes.FIT));
            }
            else if(x.equals("Bench Press")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.bench1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.bench2, ScaleTypes.FIT));
            }
            else if(x.equals("Dips")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.dips1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.dips2, ScaleTypes.FIT));
            }
            else if(x.equals("Basic squats")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.squat1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.squat2, ScaleTypes.FIT));
            }
            else if(x.equals( "Full squats")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.full1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.full2, ScaleTypes.FIT));
            }
            else if(x.equals("Calf Raises")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.calf1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.calf2, ScaleTypes.FIT));
            }
            else if(x.equals("Lunges")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.lunges1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.lunges2, ScaleTypes.FIT));
            }
            else if(x.equals("Close Chin-Ups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.close1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.close2, ScaleTypes.FIT));
            }
            else if(x.equals("Regular Pullups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.regular1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.regular2, ScaleTypes.FIT));
            }
            else if(x.equals("Wide Pullupss")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.widebar1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.widebar2, ScaleTypes.FIT));
            }
            else if(x.equals("Dumbell Rows")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.rows1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.rows2, ScaleTypes.FIT));
            }
            else if(x.equals("Barbell Bentover")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.bentover1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.bentover2, ScaleTypes.FIT));
            }
            else if(x.equals("Pike Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.pike1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.pike2, ScaleTypes.FIT));
            }
            else if(x.equals("Tricep Extension Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.exten1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.extent2, ScaleTypes.FIT));
            }
            else if(x.equals("Dumbell Overheads")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.overhead1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.overhead2, ScaleTypes.FIT));
            }
            else if(x.equals("Straight Legs dips")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.straight1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.straight2, ScaleTypes.FIT));
            }
            else if(x.equals("Vertical dips")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.tdips, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.tdips2, ScaleTypes.FIT));
            }
            else if(x.equals("Concentration Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.conc1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.conc2, ScaleTypes.FIT));
            }
            else if(x.equals("Standing Dumbell Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.curl1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.curl2, ScaleTypes.FIT));
            }
            // {"Concentration Curl", "Standing Dumbell Curl", "Alternate Dumbell Curl", "Hammer Curl", "Barbell Curl"
            else if(x.equals("Alternate Dumbell Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.alt1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.alt2, ScaleTypes.FIT));
            }
            else if(x.equals( "Hammer Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.hammer1,ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.hammer2, ScaleTypes.FIT));
            }
            else if(x.equals( "Barbell Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.barb1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.barb2, ScaleTypes.FIT));
            }
            //"Crunches", "Reverse Crunches", "Leg Raises", "Flutter Kicks", "Bicycle Crunches","Plank"
            else if(x.equals("Crunches")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.crunch1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.crunch2, ScaleTypes.FIT));
            }
            else if(x.equals("Reverse Crunches")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.rev1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.rev2, ScaleTypes.FIT));
            }
            else if(x.equals("Leg Raises")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.raise1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.raise2, ScaleTypes.FIT));
            }
            else if(x.equals( "Flutter Kicks")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.flut1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.flut2, ScaleTypes.FIT));
            }
            else if(x.equals( "Bicycle Crunches")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.cycle1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.cycle2, ScaleTypes.FIT));
            }
            else if(x.equals("Plank")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.plank1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.plank1, ScaleTypes.FIT));
            }
            imageSlider.setImageList(slideModels,ScaleTypes.FIT);
        }
    }
    public void pause(View v)
    {
        if(running){
            chronometer.stop();
            pauseoffset=SystemClock.elapsedRealtime()-chronometer.getBase();
            running=false;
            Intent intent=getIntent();
            String x=intent.getStringExtra("pu");
            ImageSlider imageSlider=findViewById(R.id.slider);
            List<SlideModel> slideModels=new ArrayList<>();
            if (x.equals("Normal Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.normal1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.normal2, ScaleTypes.FIT));
            }
            else if(x.equals("Diamond Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.diamond1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.diamond2, ScaleTypes.FIT));
            }
            else if(x.equals("Wide Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.wide1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.wide2, ScaleTypes.FIT));
            }
            else if(x.equals("Bench Press")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.bench1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.bench2, ScaleTypes.FIT));
            }
            else if(x.equals("Dips")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.dips1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.dips2, ScaleTypes.FIT));
            }
            else if(x.equals("Basic squats")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.squat1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.squat2, ScaleTypes.FIT));
            }
            else if(x.equals( "Full squats")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.full1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.full2, ScaleTypes.FIT));
            }
            else if(x.equals("Calf Raises")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.calf1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.calf2, ScaleTypes.FIT));
            }
            else if(x.equals("Lunges")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.lunges1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.lunges2, ScaleTypes.FIT));
            }
            else if(x.equals("Close Chin-Ups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.close1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.close2, ScaleTypes.FIT));
            }
            else if(x.equals("Regular Pullups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.regular1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.regular2, ScaleTypes.FIT));
            }
            else if(x.equals("Wide Pullupss")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.widebar1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.widebar2, ScaleTypes.FIT));
            }
            else if(x.equals("Dumbell Rows")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.rows1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.rows2, ScaleTypes.FIT));
            }
            else if(x.equals("Barbell Bentover")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.bentover1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.bentover2, ScaleTypes.FIT));
            }
            else if(x.equals("Pike Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.pike1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.pike2, ScaleTypes.FIT));
            }
            else if(x.equals("Tricep Extension Pushups")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.exten1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.extent2, ScaleTypes.FIT));
            }
            else if(x.equals("Dumbell Overheads")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.overhead1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.overhead2, ScaleTypes.FIT));
            }
            else if(x.equals("Straight Legs dips")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.straight1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.straight2, ScaleTypes.FIT));
            }
            else if(x.equals("Vertical dips")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.tdips, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.tdips2, ScaleTypes.FIT));
            }
            else if(x.equals("Concentration Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.conc1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.conc2, ScaleTypes.FIT));
            }
            else if(x.equals("Standing Dumbell Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.curl1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.curl2, ScaleTypes.FIT));
            }
            // {"Concentration Curl", "Standing Dumbell Curl", "Alternate Dumbell Curl", "Hammer Curl", "Barbell Curl"
            else if(x.equals("Alternate Dumbell Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.alt1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.alt2, ScaleTypes.FIT));
            }
            else if(x.equals( "Hammer Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.hammer1,ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.hammer2, ScaleTypes.FIT));
            }
            else if(x.equals( "Barbell Curl")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.barb1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.barb2, ScaleTypes.FIT));
            }
            //"Crunches", "Reverse Crunches", "Leg Raises", "Flutter Kicks", "Bicycle Crunches","Plank"
            else if(x.equals("Crunches")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.crunch1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.crunch2, ScaleTypes.FIT));
            }
            else if(x.equals("Reverse Crunches")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.rev1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.rev2, ScaleTypes.FIT));
            }
            else if(x.equals("Leg Raises")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.raise1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.raise2, ScaleTypes.FIT));
            }
            else if(x.equals( "Flutter Kicks")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.flut1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.flut2, ScaleTypes.FIT));
            }
            else if(x.equals( "Bicycle Crunches")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.cycle1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.cycle2, ScaleTypes.FIT));
            }
            else if(x.equals("Plank")) {
                name.setText(x);
                slideModels.add(new SlideModel(R.drawable.plank1, ScaleTypes.FIT));
                slideModels.add(new SlideModel(R.drawable.plank1, ScaleTypes.FIT));
            }
            imageSlider.stopSliding();
        }
    }
    public void reset(View v)
    {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseoffset=0;
        pause(v);
    }
}