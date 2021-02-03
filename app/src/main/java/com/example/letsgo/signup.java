package com.example.letsgo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {


    EditText name,email,pass,repass;
    TextView fb,goog;
    Button prob;
    DBHelper DB;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        getSupportActionBar().hide();
        name=findViewById(R.id.enewname);
        email=findViewById(R.id.enewemail);
        pass=findViewById(R.id.enewpass);
        repass=findViewById(R.id.enewrepass);
        fb=findViewById(R.id.upfb);
        goog=findViewById(R.id.upg);
        prob=findViewById(R.id.newuser);
        DB=new DBHelper(this);
        prob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  username =name.getText().toString();
                String  useremail=email.getText().toString();
                String password=pass.getText().toString();
                String repassword=repass.getText().toString();
                if(useremail.equals("")||password.equals("")||repassword.equals(""))
                    Toast.makeText(signup.this, "Please enter all the details", Toast.LENGTH_SHORT).show();
                else{
                    if(password.equals(repassword)){
                        Boolean checkuseremail=DB.checkuseremail(useremail);
                        if(checkuseremail==false){
                            Boolean insert=DB.insertData(useremail,password);
                            if(insert==true){
                                info harry=new info();
                                harry.setName(username);
                                harry.setEmail(useremail);
                                DB.addName(harry);
                                DB.addEmail(harry);
                                Log.d("hey","succefully inserted"+username);
                                Toast.makeText(signup.this, "Registered Successfully", Toast.LENGTH_SHORT).show();
                                Intent intent=new Intent(signup.this,signin.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(signup.this, "Registration Failed", Toast.LENGTH_SHORT).show();
                            }

                        }
                        else{
                            Toast.makeText(signup.this, "User Already Exist Please SignIn", Toast.LENGTH_SHORT).show();
                        }
                    }
                    else{
                        Toast.makeText(signup.this, "Password not Matching", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}