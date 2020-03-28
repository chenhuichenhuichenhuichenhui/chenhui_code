package com.chenghui.thinking.in.java.unit5;

public class B {
    String name;
    int age;

    public B(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void finalize(){
        System.out.println("B finalize");
    }
    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
