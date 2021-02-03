package com.example.letsgo;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.holder> {
    String data[];
    int image[];
    private Context context;
    public adapter(int[] img, String[] data, Context context) {
        this.image=img;
        this.data = data;
        this.context=context;
    }

    @NonNull
    @Override
    public holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row, parent, false);
        return new holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull holder holder, int position) {
        holder.tv.setText(data[position]);
        holder.img.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class  holder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv;
        public holder(@NonNull View itemView) {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.i1);
            tv=(TextView)itemView.findViewById(R.id.t1);
            tv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent=new Intent(context,watch.class);
                    intent.putExtra("pu",tv.getText().toString());
                    context.startActivity(intent);
                }
            });
        }

    }
}
