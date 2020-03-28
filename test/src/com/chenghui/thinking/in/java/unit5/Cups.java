package com.chenghui.thinking.in.java.unit5;

public class Cups {
    static Cup cup1 = new Cup(11);
    static Cup cup2 = new Cup(22);
    Cup cup3 = new Cup(33);
    static {
        cup1 = new Cup(1);
    }
    {
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
    void f(){
        f2();
        System.out.println(cup1);
    }

    static void f2(){
        //f();    error
        System.out.println(cup1);
    }
}
