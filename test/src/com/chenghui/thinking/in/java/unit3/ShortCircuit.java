package com.chenghui.thinking.in.java.unit3;

public class ShortCircuit {
    static boolean test1(int val){
        System.out.println("test("+val+")");
        System.out.println("result:  "+(val<1));
        return val<1;
    }
    static boolean test2(int val){
        System.out.println("test("+val+")");
        System.out.println("result:  "+(val<2));
        return val<2;
    }
    static boolean test3(int val){
        System.out.println("test("+val+")");
        System.out.println("result:  "+(val<3));
        return val<3;
    }

    public static void main(String[] args) {
        boolean b = test1(2) | test2(1) | test3(2);
        System.out.println("expression is  "+b);
    }
}
