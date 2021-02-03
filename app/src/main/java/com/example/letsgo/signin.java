package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class signin extends AppCompatActivity {


    EditText email,pass;
    Button prob;
    DBHelper DB;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
        email=findViewById(R.id.enteremail);
        pass=findViewById(R.id.enterpass);
        getSupportActionBar().hide();
        prob=findViewById(R.id.goin);
        DB= new DBHelper(this);
        prob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String useremail=email.getText().toString();
                String userpassword=pass.getText().toString();
                if(useremail.equals("")||userpassword.equals(""))
                    Toast.makeText(signin.this, "Please enter all the details", Toast.LENGTH_SHORT).show();
                else{
                    Boolean checkuserpass=DB.checkuserpass(useremail,userpassword);
                    if(checkuserpass==true){

                        Toast.makeText(signin.this, "Sign In Successfull", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(getApplicationContext(),after.class);
                        startActivity(intent);
                    }else {
                        Toast.makeText(signin.this, "Invalid Credentials Please SignUp", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}