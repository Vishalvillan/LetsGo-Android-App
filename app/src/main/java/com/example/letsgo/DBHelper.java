package com.example.letsgo;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DBHelper extends SQLiteOpenHelper {
    public static final String DBNAME="sign.db";

    public DBHelper( Context context) {
        super(context, "sign.db", null, 1);
    }

    @Override

    public void onCreate(SQLiteDatabase MyDB) {
        MyDB.execSQL("create Table users(email TEXT primary key,pass TEXT )");
    }

    @Override
    public void onUpgrade(SQLiteDatabase MyDB, int oldVersion, int newVersion) {
        MyDB.execSQL("drop Table if exists users");
    }
    public boolean insertData(String email,String pass){
        SQLiteDatabase MyDB= this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put("email",email);
        contentValues.put("pass",pass);
        long result= MyDB.insert("users",null,contentValues);
        if(result==-1) return false;
        else
            return true;
    }
    public boolean checkuseremail(String email){
        SQLiteDatabase MyDB= this.getWritableDatabase();
        Cursor cursor= MyDB.rawQuery("Select * from users where email=?",new String[]{email});
        if(cursor.getCount()>0)
            return  true;
        else
            return false;
    }
    public boolean checkuserpass(String email,String pass){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        Cursor cursor=MyDB.rawQuery("Select * from users where email=? and pass=?",new String[]{email,pass});
        if(cursor.getCount()>0)
            return  true;
        else
            return  false;
    }
    public List<info> getAllContacts(){
        List<info> contactList=new ArrayList<>();
        SQLiteDatabase db=this.getReadableDatabase();
        String select ="SELECT * FROM " +params.TABLE_NAME;
        Cursor cursor=db.rawQuery(select,null);
        //loop now
        if(cursor.moveToFirst()){
            do {
                info contact=new info();
                contact.setName(cursor.getString(0));
                contact.setEmail(cursor.getString(1));
                contactList.add(contact);
            }while (cursor.moveToNext());
        }
        return contactList;
    }
    public void addName(info inf){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(params.KEY_NAME,inf.getName());
        MyDB.insert(params.TABLE_NAME,null,values);
        MyDB.close();
    }
    public void addEmail(info inf){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(params.KEY_EMAIL,inf.getEmail());
        MyDB.insert(params.TABLE_NAME,null,values);
        MyDB.close();
    }
    public void addType(info inf){
        SQLiteDatabase MyDB=this.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put(params.KEY_Type,inf.getName());
        MyDB.insert(params.TABLE_NAME,null,values);
        MyDB.close();
    }
}

