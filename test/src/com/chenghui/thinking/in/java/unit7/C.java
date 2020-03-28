package com.chenghui.thinking.in.java.unit7;

public class C extends A{
    B b ;

    C(int i){
       super(i);
       b = new B(i);
        System.out.println("C constructor");
    }

    C(){
        super(1);
        System.out.println(b);
    }

    public static void main(String[] args) {
        C c = new C();
    }
}
