package com.chenghui.thinking.in.java.unit3;

public class URShift {
    public static void main(String[] args) {
        int i = -1;
        //System.out.println(Integer.toBinaryString(i));
        byte b = 2;
        //System.out.println(b);
        //System.out.println(Integer.toBinaryString(b));
        //System.out.println(Integer.toBinaryString(-2));
        //System.out.println(b>>>1);
        //System.out.println(Integer.toBinaryString(27));
        System.out.println(Integer.toBinaryString(-14));
        int i2 = -14>>2;
        System.out.println(Integer.toBinaryString(i2));
        System.out.println("i2:: "+i2);
        int i3 = -14>>>2;
        System.out.println(Integer.toBinaryString(i3));
        System.out.println("==================================");
        double d = 0.1+0.2;
        System.out.println(d);
        System.out.println("==================================");
        System.out.println(6^11);
        System.out.println(6&11);



    }
}
