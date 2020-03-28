package com.chenghui.thinking.in.java.unit5;

public class Task8 {
    public void f1(){
        this.f2();
        f2();
    }
    public void f2(){
        System.out.println("1111");
    }

    public static void main(String[] args) {
        Task8 t = new Task8();
        t.f1();

    }
}
