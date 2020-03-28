package com.chenghui.suanfa;

public class MergeSort {
    public void mergeSort(int[] arr, int p, int q){
        if(p >= q) {
            return;
        };
        int mid = (p+q)/2;
        mergeSort(arr, p, mid);
        mergeSort(arr, mid+1,q);
        merge(arr, p, mid, q);
    }
    private void merge(int[] arr, int p, int mid, int q){
        int[] temp = new int[arr.length]; //此处将数组设为全局变量，否则每次都要创建一遍。
        int i = p, j = mid+1,iter = p;
        while(i <= mid && j <= q){
            if(arr[i] <= arr[j]) {
                temp[iter++] = arr[i++];
            } else{
                temp[iter++] = arr[j++];
            }
        }

        while(i <= mid) {
            temp[iter++] = arr[i++];
        }

        while(j <= q){
            temp[iter++] = arr[j++];
        }

        for(int t = p; t <= q; t++) {
            arr[t] = temp[t];
        }
    }
}
