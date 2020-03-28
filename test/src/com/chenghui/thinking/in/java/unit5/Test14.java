package com.chenghui.thinking.in.java.unit5;

public class Test14 {
    static String s1;
    static String s2;
    Test14(){
        s1 = "s1";
        System.out.println(s1);
    }
    static {
        s2 = "s2";
        System.out.println(s2);
    }
    static  void  f(){
        System.out.println(s1);
        System.out.println(s2);
    }
}
