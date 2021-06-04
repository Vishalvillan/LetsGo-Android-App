package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class work extends AppCompatActivity {

    ImageView imageView,wi2;
    TextView textView,pmuscles,headname,levelname;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);
        getSupportActionBar().hide();

        wi2=findViewById(R.id.wi2);
        textView=findViewById(R.id.worktext);
        pmuscles=findViewById(R.id.pmuscles);
        headname=findViewById(R.id.headname);
        levelname=findViewById(R.id.levelname);
        Intent intent=getIntent();
        String a=intent.getStringExtra("name");
        String b=intent.getStringExtra("level");
        Log.d("level",b);
        /*HashMap<String,ArrayList<String>> arr =(HashMap<String, ArrayList<String>>)intent.getSerializableExtra("name");
        for (HashMap.Entry<String,ArrayList<String>> entry: arr.entrySet()){
            String key=entry.getKey();
            ArrayList<String> value=entry.getValue();
            for (String aString:value){
                textView.setText(aString);
            }
        }*/

            levelname.setText(b);

        if(a.equals("Normal Pushups")){
            headname.setText(a);
            wi2.setImageResource(R.drawable.normal2);
            pmuscles.setText("Chest , Shoulder ,Triceps and Back");
            textView.setText("Strengthens the upper body as well as the core and back muscles.Your Hands flat on the ground below your shoulders,hands flat Breath in as you bend your elbows. ");
        }
        else if(a.equals("Wide Pushups")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.wide2);
            pmuscles.setText("Chest");
            textView.setText("Strengthens the upper body and core with more focus on pectoral muscles.Your hands further out to each side,roughly 2.5 to 3 feet apart.Keep your elbows tracking back");
        }
        else if(a.equals("Diamond Pushups")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.diamond2);
            pmuscles.setText("Chest , Triceps ");
            textView.setText("Strengthens the upper body and core, with more focus on the triceps.Begin in a plank position, with your hands together and angled inward at 45 degrees so that your index fingers and thumbs touch to form a triangle (or diamond). Keep your elbows tight to your body and bend them to lower your chest toward the triangle");
        }

        else if(a.equals("Bench Press")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.bench2);
            pmuscles.setText("Chest ");
            textView.setText("Strengthens the upper body ,chest including arms and shoulders.Lie flat on your back on a bench.Grip the bar wider than shoulder,bring the bar slowly down to your chest as breath in. then push up as you breath out.");
        }
        else if(a.equals("Dips")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.dips2);
            pmuscles.setText("Triceps");
            textView.setText("Strengthens the upper body that focuses on triceps.Hold on to the parallel bars with arms straight ,you then bend your elbows untill arms are parallel to ground before driving to the starting position.");
        }
        else if(a.equals("Basic Squats")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.squat2);
            pmuscles.setText("Quads ,Hamstring and Glutes");
            textView.setText("Shapes your legs they'll also help your balance and mobility.Stand By standing with your feet ,bracing your core,chest up,then bend your knees and push your hip back and when thighs are parallel to floor,pause then push to starting position.");
        }
        else if(a.equals( "Full Squats")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.full2);
            pmuscles.setText("Quads ,Hamstring and Glutes");
            textView.setText("This is normal");
        }
        else if(a.equals("Calf Raises")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.calf2);
            pmuscles.setText("Gastocnemius and Soleus muscles,calf");
            textView.setText("Stand near a wall for balance,ankles,knees and hips in vertical alignment.Press down into the balls of both feet to raise body upward,then then slowly down.");
        }
        else if(a.equals("Flutter Kicks")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.flut2);
            textView.setText("This is normal");
        }
        else if(a.equals("Lunges")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.lunges2);
            pmuscles.setText("Calves ,Quadriceps , Hamstring and Glutes");
            textView.setText("Stand up tall, step forward with one foot until your leg reaches a 90 degree angle.Your rear knee  should remain parallel to the ground and front knee shouldnt go beyond toes.lift your  front lunging leg to return to starting starting position.");
        }
        else if(a.equals("Regular Pullups")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.regular2);
            pmuscles.setText("Lower trapezius (the middle back)");
            textView.setText("The Pull-Up targets the lower trapezius (the middle back) and the latimuss dorsi more effectively than the Chin-Up.Overhand or \"pronated\" grip, hands slightly wider than shoulder-width apart");
        }
        else if(a.equals("Wide Pullups")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.widebar2);
            pmuscles.setText("Back and Upper Body");
            textView.setText("It is and upperbody strengthning exercise.Start by standing underneath a pullup bar,with back and spin straight.Your grip should be wider than your body.Reach up and thumb should be pointing to each other.");
        }
        else if(a.equals("Close Chinups")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.close2);
            pmuscles.setText("Back and Biceps");
            textView.setText("Strengthens back and biceps.Start off standing in front of  pull up bar and grabbing it,keeping your hands about a foot apart,lift your body,chin above the bar then sqeeze  with your lats and Repeat.");
        }
        else if(a.equals("Dumbell Rows")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.rows2);
            textView.setText("Strengthens the back.Stand with your feet shoulder-width apart and hinge to lean over the bench on one hand,keeping back straight,Row the weigth ups and Repeat.");
        }
        else if(a.equals("Barbell Bentover")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.bentover2);
            pmuscles.setText("Back and Shoulders");
            textView.setText("Strengthens back and shoulders.Bend the knees slightly and bring the torso forward over the bar, back straight,Grasp the barbell  keep the upper body stationary and pull the barbell.");
        }
        else if(a.equals("Pike Pushups")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.pike2);
            pmuscles.setText("Shoulders, Back and Triceps");
            textView.setText("Strengthens the upper body and core, with more focus on the shoulders.Begin in a downward dog yoga position, with your feet and hands just wider than shoulder width. Keep your hips high, heels low, and maintain the inverted-V position as you bend your elbows and lower your head toward the floor between your hands");
        }
        else if(a.equals("Tricep Extension Pushups")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.extent2);
            pmuscles.setText("Triceps");
            textView.setText("Strengthens the upper body and core, with more focus on the triceps.Start in a plank position, with your forearms flat on the ground, shoulder-width apart and parallel. Push up with your triceps to lift your elbows off the ground; continue until your arms are fully extended, then lower your elbows until just above the ground (don’t weight your forearms again) for one repetition.");
        }
        else if(a.equals("Dumbell Overheads")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.overhead2);
            pmuscles.setText("Triceps");
            textView.setText("Targets your tricep muscles by repitively flexing the elbow joint against resistance.Start standing or sitting with your shoulder apart,helding the dumbell,Raise the dumbell above your head untill your arms are stretched out.");
        }
        else if(a.equals("Straight Legs Dips")){
            headname.setText(a);
            wi2.setImageResource(R.drawable.straight2);
            imageView.setImageResource(R.drawable.straight1);
            textView.setText("This is normal");
        }
        else if(a.equals("Concentration Curl")){
            headname.setText(a);

            pmuscles.setText("Biceps");
            textView.setText("Helps to build big arms and make your biceps pop.Position your arms on your thigh,slowly curl the weight up only moving your forearms.At the top pause for for a beat and squeeze your biceps then slowly down.Do all reps with one hand");
            wi2.setImageResource(R.drawable.conc2);
        }
        else if(a.equals("Standing Dumbell Curl")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.curl2);
            pmuscles.setText("Biceps");
            textView.setText("Strengthens the biceps.Grab a pair of dumbells,stand straigth.Allow the dumbells to hang  at arms length with palms facing forward,now without moving your upper arms bend your elbows and curl the dumbell as close to your shoulders.");

        }
        else if(a.equals("Alternate Dumbell Curl")){
            headname.setText(a);

            textView.setText("This is normal");
            wi2.setImageResource(R.drawable.alt2);
        }
        else if(a.equals("Barbell Curl")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.barb2);
            textView.setText("This is normal");
     }
        else if(a.equals("Hammer Curl")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.hammer2);
            pmuscles.setText("Biceps");
            textView.setText("Strengthens the biceps and forearms.Stand up straight,holding them alongside you,palms should face your body,keep biceps stationary and bend the elbows lifting both dumbells.");
        }
        else if(a.equals("Crunches")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.crunch2);
            pmuscles.setText("Core and Abdominal Muscles");
            textView.setText("Strengthens the  core and abdominal muscles.Lie down your back,plant your feet on floor hip-width apart,bend your knees exhale and lift your body head and neck relaxed.Inhale and return to starting");
        }
        else if(a.equals("Plank")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.plank1);
            textView.setText("This is normal");
        }
        else if(a.equals("Bicycle Crunches")){
            headname.setText(a);
            pmuscles.setText("Core and Abdominal Muscles");
            wi2.setImageResource(R.drawable.cycle2);
            textView.setText("This is normal");
        }
        else if(a.equals("Flutter Kicks")){
            headname.setText(a);
            wi2.setImageResource(R.drawable.flut2);
            pmuscles.setText("Core and Abdominal Muscles");
            textView.setText("This is normal");
        }
        else if(a.equals("Leg Raises")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.raise2);
            pmuscles.setText("Core and Abdominal Muscles");
            textView.setText("Strengthens the  core and abdominal muscles,lower abs.Lay flat on the floor with arms at your side and legs stretched out,then raise those legs.Keep your legs as straigth as possible and lift untill they point to ceiling and then bring down straight.");
        }
        else if(a.equals("Reverse Crunches")){
            headname.setText(a);

            wi2.setImageResource(R.drawable.rev2);
            pmuscles.setText("Core and Abdominal Muscles");
            textView.setText("Hits all the showy exterior abs muscles,lower abs muscles for an overall strong core.Start lying down with your arms by your sides.Raise your legs so your thighs are perpendicular to the floor and your knees are bent at a 90 degree angle.Breath out  and contract your abs to bring your knees up towards your chest and Raise your hips off the floor.");
        }
    }
}