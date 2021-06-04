package com.example.letsgo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class inside extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<String> arrayList=new ArrayList<>();
    MainAdapter adapter3;
    ImageView i5,i6,i7;
    TextView t,t1;
    Dialog dialog;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inside);
        recyclerView=findViewById(R.id.rclview5);
        i5=findViewById(R.id.i1);
        getSupportActionBar().hide();
        i6=findViewById(R.id.badgeimage);
        t=findViewById(R.id.badge);
        t1=findViewById(R.id.t1);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        arrayList.addAll(Arrays.asList("12 Normal Pushups", "7 Diamond Pushups", "7 ChinUps", "4 Pullups", "50 Cunches","25 Normal Pushups", "15 Diamond Pushups", "10 ChinUps", "8 Pullups", "100 Cunches"));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter3=new MainAdapter(this,arrayList);
        dialog=new Dialog(this);
        recyclerView.setAdapter(adapter3);
        new ItemTouchHelper(new ItemTouchHelper.SimpleCallback(0,ItemTouchHelper.RIGHT) {
            @Override
            public boolean onMove(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.ViewHolder viewHolder, @NonNull RecyclerView.ViewHolder target) {
                return false;
            }
            public void onSwiped(@NonNull RecyclerView.ViewHolder viewHolder, int direction) {
                arrayList.remove(viewHolder.getAdapterPosition());
                adapter3.notifyDataSetChanged();
                if(arrayList.size()==5){
                    Toast.makeText(inside.this, "Congratulations..BORN ATHLETE ", Toast.LENGTH_SHORT).show();
                    t.setText("ATHLETE");
                    i6.setImageResource(R.drawable.athl);
                    openDialog();
                }
                else if(arrayList.size()==0){
                    Toast.makeText(inside.this, "Congratulations..BORN COMMANDO ", Toast.LENGTH_SHORT).show();
                    t.setText("COMMANDO");
                    i6.setImageResource(R.drawable.comm);
                    openDialog();
                }
            }

            private void openDialog() {
                dialog.setContentView(R.layout.cust_layout);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                Button btnOk=dialog.findViewById(R.id.btnOk);
                dialog.show();
                btnOk.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });
            }

        }).attachToRecyclerView(recyclerView);
        /*ArrayList<example> examples=new ArrayList<>();
        examples.add(new example("Goal1"));
        examples.add(new example("Goal2"));
        examples.add(new example("Goal3"));
        recyclerView=findViewById(R.id.rclview5);
        mLayoutManager=new LinearLayoutManager(this);
        mAdapter=new adapter2(examples);
        recyclerView.setLayoutManager(mLayoutManager);*/
    }
}