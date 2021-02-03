package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class MainActivity extends AppCompatActivity {
    TextView tview;
    Button login, sup;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        tview=findViewById(R.id.hemail);
        login=findViewById(R.id.btnlogin);
        sup=findViewById(R.id.btnsignup);
        YoYo.with(Techniques.Bounce).duration(700).repeat(0).playOn(tview);
        YoYo.with(Techniques.Bounce).duration(700).repeat(0).playOn(login);
        YoYo.with(Techniques.Bounce).duration(700).repeat(0).playOn(sup);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login has been clicked", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,signin.class);
                startActivity(intent);
            }
        });
        sup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "SignUp has been clicked", Toast.LENGTH_LONG).show();
                Intent intent=new Intent(MainActivity.this,signup.class);
                startActivity(intent);
            }
        });
    }
}