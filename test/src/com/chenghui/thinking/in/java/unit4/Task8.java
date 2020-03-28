package com.chenghui.thinking.in.java.unit4;

import java.util.Random;

public class Task8 {
    public static void main(String[] args) {
        Random ran = new Random(47);
        for(int i = 0;i<5;i++){
            int c = ran.nextInt(7)+1;
            switch (c){
                case 1:
                    System.out.println("工作日; "+c);
                    //break;
                case 2:
                    System.out.println("工作日; "+c);
                    //break;
                case 3:
                    System.out.println("工作日; "+c);
                    //break;
                case 4:
                    System.out.println("工作日; "+c);
                    //break;
                case 5:
                    System.out.println("工作日; "+c);
                    break;
                case 6:
                    System.out.println("周末; "+c);
                    //break;
                case 7:
                    System.out.println("周末; "+c);
                    break;
                    default:
                        System.out.println("错误的数据");
            }
        }
    }
}
