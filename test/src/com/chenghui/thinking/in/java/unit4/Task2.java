package com.chenghui.thinking.in.java.unit4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random ran = new Random();
        int pre=-1;
        while(true){
            int k = ran.nextInt(100);
            if(pre!=-1) {
                if (k < pre) {
                    System.out.println("value: "+pre+" 大于紧随的数");
                }else if(k>pre){
                    System.out.println("value: "+pre+" 小于紧随的数");
                }else{
                    System.out.println("value: "+pre+" 等于紧随的数");
                }
            }
            pre = k;

        }
    }
}
