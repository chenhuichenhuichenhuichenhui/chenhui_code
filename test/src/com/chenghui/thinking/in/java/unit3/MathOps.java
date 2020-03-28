package com.chenghui.thinking.in.java.unit3;

import java.util.Random;

public class MathOps {
    public static void main(String[] args) {
        Random rand = new Random(47);
        int i,j,m;
        short n;
        //Boolean
        i = rand.nextInt(100)+1;
        System.out.println("i==========="+i);
        j = rand.nextInt(100)+1;
        System.out.println("j==========="+j);
        m = rand.nextInt(100)+1;
        System.out.println("m==========="+m);
        n = +5;
        System.out.println("n==========="+n);
    }
}
