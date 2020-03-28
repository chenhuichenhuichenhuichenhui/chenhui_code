package com.chenghui.thinking.in.java.unit6.test8;

public class Connectionmanager {
    private Connection[] cons = new Connection[]{new Connection(),new Connection(),new Connection()};
    private int count = 3;
    public Connection makeConnection(){
        if(count<1){return null;}
        count--;
        return cons[count];
    }
}
