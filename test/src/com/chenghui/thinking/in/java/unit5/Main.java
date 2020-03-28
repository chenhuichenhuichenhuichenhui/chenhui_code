package com.chenghui.thinking.in.java.unit5;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        A a = new A(new B("allen",20));
        a = null;
        System.gc();
        Thread.sleep(5000);
        System.out.println(C.a.b);

    }
}
