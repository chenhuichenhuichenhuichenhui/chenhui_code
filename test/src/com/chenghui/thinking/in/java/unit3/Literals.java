package com.chenghui.thinking.in.java.unit3;

public class Literals {
    public static void main(String[] args) {
        int i1 = 0x2f;
        System.out.println("i1:  "+Integer.toBinaryString(i1));
        char c = 0xffff;
        System.out.println("c:   "+Integer.toBinaryString(c));
        long l1 = 0x2f;
        long l2 = 0177;
        System.out.println("l1:   "+Long.toBinaryString(l1));
        System.out.println("l2:   "+Long.toBinaryString(l2));
        long s = 2;
        float f = 8.9f;
        double expDouble = 47e47d;
        System.out.println("expDouble:   "+expDouble);

    }
}
