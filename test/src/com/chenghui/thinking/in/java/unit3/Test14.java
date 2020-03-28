package com.chenghui.thinking.in.java.unit3;

public class Test14 {
    public static void main(String[] args) {
        String a = "vf";
        String b = "vf";
        f(a,b);
    }
    public static void f(String a,String b){
        System.out.println("a==b ::"+a==b);
        System.out.println("a!=b ::"+a!=b);
        System.out.println("a.equals(b) ::"+a.equals(b) );
        //System.out.println("a&b :"+a & b);
    }
}
