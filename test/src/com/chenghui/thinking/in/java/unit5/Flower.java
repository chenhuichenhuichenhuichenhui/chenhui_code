package com.chenghui.thinking.in.java.unit5;

public class Flower {
    int p ;
    String s;
    public Flower(String s){
        this.s = s;
    }
    public Flower(int p){
        this.p = p;
    }
    public Flower(int p ,String s){
        this(s);
        this.p = p;
    }
    public void f1(){
        //this(5);
    }

    public static void main(String[] args) {

    }
}
