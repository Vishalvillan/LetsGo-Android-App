package com.example.letsgo;


public class info {
    private String name;
    private String email;
    private String type;
    public info(String name,String email)
    {
        this.name=name;
        this.email=email;
    }
    public info(){
        this.email=email;
    }
    public info(String type){
        this.type=type;
    }
    public  void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public  void setType(String type){
        this.type=type;
    }
    public  String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getType(){
        return type;
    }

}
