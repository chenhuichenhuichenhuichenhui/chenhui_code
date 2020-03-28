package com.chenghui.thinking.in.java.unit5;

import com.chenghui.thinking.in.java.unit1.practice.Test1;

public class VarArgs {
    static void printArray(Object... args){
        for(Object o:args){
            System.out.printf(o+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
       // printArray(new Integer(47),new Double(1.1),new A1());
        //printArray();
        Test1.main(args);
    }
}
class A1{

}
