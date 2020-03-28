package com.chenghui.thinking.in.java.unit4;

public class Task9 {
    public static void main(String[] args) {
        for(int i = 1;i<=5;i++){
            System.out.print(fibonacci(i)+"、");
        }
    }
    public static int fibonacci(int n){
        if(n==1){
            return 1;
        }
        if(n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
}
