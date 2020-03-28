package com.chenghui.thinking.in.java.unit5;

public class OverloadingVarargs2 {
    /*static void f(float i,Character... args){
        System.out.println(i+" ");
        System.out.println(Arrays.toString(args));
        System.out.println("first");
    }*/
    static void f(Character... args){
        System.out.println("second");
    }
    static void f(Integer... args){
        System.out.println("third");
    }

    public static void main(String[] args) {
        //f(1,'a');
        //f('a','b');
        f('a');
    }
}
