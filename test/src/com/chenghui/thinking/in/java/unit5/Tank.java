package com.chenghui.thinking.in.java.unit5;

public class Tank {
    String status = null;
    Tank(String status){
        this.status = status;
    }
    public void checked(){
        status = null;
    }
    protected void finalize(){
        if(status!=null){
            System.out.println("Error : full");
        }
    }
}
