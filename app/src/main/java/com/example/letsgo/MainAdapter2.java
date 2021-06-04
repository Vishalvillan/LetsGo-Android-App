package com.example.letsgo;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class MainAdapter2 extends BaseExpandableListAdapter {
    ArrayList<String>  listgroup;
    HashMap<String,ArrayList<String>> listchild;
    Context context;

    public  MainAdapter2(ArrayList<String> listgroup,HashMap<String,ArrayList<String>> listchild,Context context){
        this.listchild=listchild;
        this.listgroup=listgroup;
        this.context=context;
    }
    public int getGroupCount() {

        return listgroup.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return listchild.get(listgroup.get(groupPosition)).size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return listgroup.get(groupPosition);

    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {

        return listchild.get(listgroup.get(groupPosition)).get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return 0;
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return 0;
    }

    @Override
    public boolean hasStableIds() {
        return false;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_expandable_list_item_1,parent,false);
        TextView textView=convertView.findViewById(android.R.id.text1);
        String sGroup=String.valueOf(getGroup(groupPosition));
        textView.setText(sGroup);
        textView.setTypeface(null, Typeface.BOLD);
        textView.setTextColor(Color.BLUE);
        return convertView;
    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, final ViewGroup parent) {

        convertView = LayoutInflater.from(parent.getContext()).inflate(android.R.layout.simple_expandable_list_item_1,parent,false);
        TextView textView=convertView.findViewById(android.R.id.text1);
        final String sChild=String.valueOf(getChild(groupPosition,childPosition));
        final String sGroup=String.valueOf(getGroup(groupPosition));
        textView.setText(sChild);
       textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Toast.makeText(parent.getContext(), ""+sChild, Toast.LENGTH_SHORT).show();
               String a=sChild;
               Intent intent=new Intent(context,work.class);
               intent.putExtra("name",sChild);
               intent.putExtra("level",sGroup);
               //intent.putExtra("name",(Serializable)listchild);
               context.startActivity(intent);
           }
       });
        return convertView;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return false;
    }
}
