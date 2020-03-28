package com.chenghui.jikeshijian.Beautifuldata.rumen;

public class task4 {
    int n = 10;
    int[] array = new int[n];
    int count = 0;

    void insert(int val){
        if(count == array.length){
            int sum = 0;
            for(int i = 0;i<array.length;i++){
                sum+=array[i];
            }
            array[0] = sum;
            count = 1;
        }
        array[count] = val;
        count++;
    }
}
