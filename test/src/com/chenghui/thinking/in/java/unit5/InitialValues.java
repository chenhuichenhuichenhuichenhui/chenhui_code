package com.chenghui.thinking.in.java.unit5;

public class InitialValues {
    char c;
    void print(){
        System.out.printf("char;"+c);
    }

    public static void main(String[] args) {
        InitialValues i = new InitialValues();
        i.print();
    }
}
