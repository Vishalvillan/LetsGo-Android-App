package com.example.letsgo;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainAdapter extends RecyclerView.Adapter<MainAdapter.ViewHolder> {

    Activity activity;
    ArrayList<String> arrayList;
    ImageView i7;
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row2, parent, false);
       // View view= LayoutInflater.from(parent.getContext()).inflate(android.R.layout.row2,)
        return  new ViewHolder(view);
    }
    public  MainAdapter(Activity activity,ArrayList<String> arrayList){
        this.activity=activity;
        this.arrayList=arrayList;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder holder, int position) {
        holder.tv5.setText(arrayList.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(activity,arrayList.get(holder.getAdapterPosition()),Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tv5;
        ImageView im5;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tv5=itemView.findViewById(R.id.t1);
            im5=itemView.findViewById(R.id.i1);
            i7=itemView.findViewById(R.id.imv5);
        }
    }
}
