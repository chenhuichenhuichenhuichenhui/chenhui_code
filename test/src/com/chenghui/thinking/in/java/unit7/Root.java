package com.chenghui.thinking.in.java.unit7;

public class Root {
    Component1 c1 ;
    Component2 c2 ;
    Component3 c3 ;

    Root(int i){
        c1 = new Component1(i);
        c2 = new Component2(i);
        c3 = new Component3(i);
        System.out.println("Root constructor");
    }
}
