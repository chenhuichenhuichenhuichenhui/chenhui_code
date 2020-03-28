package com.chenghui.thinking.in.java.unit5;

public class TankTest {
    public static void main(String[] args) {
        Tank t = new Tank("full");
        t.checked();
        new Tank("full");
        System.gc();
    }
}
