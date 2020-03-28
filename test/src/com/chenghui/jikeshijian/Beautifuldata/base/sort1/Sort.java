package com.chenghui.jikeshijian.Beautifuldata.base.sort1;

import java.util.Arrays;

/**
 * 冒泡排序、插入排序、选择排序
 */
public class Sort {
    //冒泡排序，a是数组，n表示数组大小
    public static void bubbleSort(int[] a,int n){
        if(n<=1){return;}
        for(int i = 0;i<n;i++){
            //提前退出得标志位
            boolean flag = true;
            for(int j = 0;j<n-i-1;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    //此次冒泡有数据交换
                    flag = false;
                }

            }
            if(flag){return;}//没有数据交换，提前退出

        }
    }
    /**
     * 冒泡排序的改进：在每轮排序后 记录最后一次元素交换的位置，作为最后一次元素交换
     * 的边界，对于边界外的元素在下次循环中无需比较
     */
    public static void bubbleSort2(int[] a,int n){
        if(n<=1)return;

        //最后一次交换的位置
        int lastExchange = 0;
        //无序数据的边界，每次只需要比较到这里即可退出
        int sortBorder = n-1;
        for(int i = 0;i<n;i++){
            //提前退出的标志位
            boolean flag = false;
            for(int j = 0;j<sortBorder;j++){
                if(a[j]>a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    //更新最后一次交换的位置
                    lastExchange = j;
                    //此次冒泡有数据交换
                    flag = true;
                }
            }
            sortBorder = lastExchange;
            if(!flag)return;//没有数据交换，提前退出
        }
    }
    //插入排序：稳定排序 原地排序
    public static void insertionSort(int[] a,int n){
        if(n<=1)return;

        for(int i = 1;i<n;i++){
            int value = a[i];
            int j = i-1;
            for(;j>=0;j--){
                if(a[j]>value){
                    a[j+1] = a[j];
                }else{
                    break;
                }
            }
            a[j+1] = value;
        }
    }

    //选择排序: 原地排序 非稳定排序
    public static void selectionSort(int[] a,int n){
        if(n<=1)return;

        for(int i = 0;i<n-1;i++){
            //查找最小值
            int minIndex = i;
            for (int j = i+1;j<n;j++){
                if(a[j]<a[minIndex]){
                    minIndex = j;
                }
            }

            //交换
            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{3,4,2,1,5,6,7,8};
        bubbleSort2(array,array.length);
        System.out.println(Arrays.toString(array));
    }



}
