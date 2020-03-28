package com.chenghui.thinking.in.java.unit7;

public class Component1 {
    Component1(int i){
        System.out.println("Component1 constructor");
    }


    public static void main(String[] args) {
        String r = "chen,123";
        String s1 = r.split(",")[0];
        System.out.println(s1);
        String s2 = r.split(",")[1];
        System.out.println(s2);



    }


}
