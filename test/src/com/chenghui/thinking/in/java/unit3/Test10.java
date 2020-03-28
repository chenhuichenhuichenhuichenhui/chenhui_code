package com.chenghui.thinking.in.java.unit3;

public class Test10 {
    public static void main(String[] args) {
        String s1 = "10101010";
        String s2 = "101010101";
       int x1 =  Integer.parseInt(s1,2);
       int x2 = Integer.parseInt(s2,2);
       String t1 = Integer.toHexString(x1).toUpperCase();
       String t2 = Integer.toHexString(x2).toUpperCase();
        System.out.println("t1(10101010):"+t1);
        System.out.println("t2(101010101)"+t2);
        Integer.toBinaryString(x1);
        //System.out.println("t1&t2"+);
        Integer er = null ;
        Integer ser = 1;
        if(ser.equals(er)){
            System.out.println("true");
        }else{
            System.out.println(false);
        }

    }
}
