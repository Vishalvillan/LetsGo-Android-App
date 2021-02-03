package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class    diet extends AppCompatActivity {

    Button btn;
    Button btn1;
    Button btn2;
    TextView txt1;
    TextView txt2;
    TextView txt3;
    TextView txt4;
    TextView txt5;
    TextView tv6;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);
        btn = findViewById(R.id.mybtn);
        getSupportActionBar().hide();
        btn1 = findViewById(R.id.myVeg);
        btn2 = findViewById(R.id.myNonveg);
        txt1 = findViewById(R.id.vegb);
        txt2 = findViewById(R.id.vegms);
        txt3 = findViewById(R.id.vegl);
        txt4 = findViewById(R.id.veges);
        txt5 = findViewById(R.id.vegd);
        tv6 = findViewById(R.id.typem);
        Intent intent = getIntent();
        String a = intent.getStringExtra("type");
        if (a.equals("Yoga  and Aerobics")) {
            btn.setText(a);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt1.setText("2 egg whites and 1 whole egg, 2 slices whole grain toast");
                    txt2.setText("  Mix fruit 1 cup,nuts");
                    txt3.setText("1 cup brown rice ,1 cup hooked spinach,1 apple");
                    txt4.setText("25g whey protein");
                    txt5.setText("1 medium salad. 1 cup whole grain couscous,2 cups broccoli and cauliflower");
                    tv6.setText("VEG");
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt1.setText("2 egg whites and 1 whole egg, 2 slices whole grain toast");
                    txt2.setText("Mix fruit 1 cup,nuts");
                    txt3.setText("1 cup brwon rice ,1 cup hooked spinach,chicken breast,1 apple");
                    txt4.setText("25g whey protein");
                    txt5.setText("1 medium salad. 1 cup whole grain couscous,2 cups broccoli and cauliflower");
                    tv6.setText("VEG,NON-VEG");
                }
            });
        } else if (a.equals("Calisthenics and Strength")) {
            btn.setText(a);
            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt1.setText("Avocado +High fiber Breads,various nuts +green tea,Paneer Prantha");
                    txt2.setText(" Green smoothie+ lemon water");
                    txt3.setText("Brown rice with lentil and bean curry with some avocado,Mixed Bean Sabzi");
                    txt4.setText("Banana smoothie, Peanut butter+ Protein powder");
                    txt5.setText("Avocado,Scrambled eggs style tofu with cheesy quinoa");
                    tv6.setText("VEG");
                }
            });
            btn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    txt1.setText("2 egg whites and 1 whole egg, 2 slices whole grain toast,oatmeal");
                    txt2.setText("Mix fruit 1 cup,nuts,chicken soup");
                    txt3.setText("1 cup brown rice,fish ,1 cup hooked spinach,1 apple");
                    txt4.setText("25g whey protein + Sweet Potato");
                    txt5.setText("1 medium salad.,chicken, 1 cup whole grain couscous,2 cups broccoli and cauliflower");
                    tv6.setText("VEG");
                }
            });
        }
    }
}