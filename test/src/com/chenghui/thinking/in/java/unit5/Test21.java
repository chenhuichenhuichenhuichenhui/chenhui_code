package com.chenghui.thinking.in.java.unit5;

public class Test21 {
    public static void main(String[] args) {

        double v = (3.14 + 1e20) - 1e20;
        System.out.println(v);
        double x = 3.14 + (1e20 - 1e20);
        System.out.println(1e20);
        int i = 200*300*400*500;
        System.out.println(i);
        float f = 40e-4F;
        System.out.println("f="+f);

        double d = 47e47;
        System.out.println("d="+d);

    }
}

