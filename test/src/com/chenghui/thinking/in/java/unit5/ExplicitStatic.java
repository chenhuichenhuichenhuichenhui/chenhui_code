package com.chenghui.thinking.in.java.unit5;

public class ExplicitStatic {
    public static void main(String[] args) {
        System.out.println("Inside main");
       //Cups.cup1.f(99);
        Other o = new Other();
    }
    static Cups cups1 = new Cups();
    //static Cups cups2 = new Cups();
}