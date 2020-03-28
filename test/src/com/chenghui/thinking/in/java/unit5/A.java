package com.chenghui.thinking.in.java.unit5;

public class A {
    B b;
    public A(B b){
        this.b = b;
    }

    public void finalize(){
        System.out.println("A finalize");
        C.a=this;
    }
}
