package com.chenghui.thinking.in.java.unit4;

public class Task4 {
    public static void main(String[] args) {
        int j;
        for(int i = 1; i<=100;i++){
            for(j=2;j<i;j++){
                if(i%j==0){
                    break;
                }
            }
            if(j==i) {
                System.out.print(i + " ");
            }
        }
    }
}
