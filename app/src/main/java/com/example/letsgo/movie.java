package com.example.letsgo;

import android.widget.ImageView;

public class movie {
    private String title;
    private String about;
    public movie(String title,String about){
        this.title=title;
        this.about=about;
    }
    public  String getTitle()
    {
        return title;
    }
    public void setTitle(String title){
        this.title=title;
    }
    public void setAbout(String about){
        this.about=about;
    }
    public String getAbout()
    {
        return about;
    }
    public  String toString(){
        return "Movie Title"+ title+"\'"+"about "+about;
    }
}
