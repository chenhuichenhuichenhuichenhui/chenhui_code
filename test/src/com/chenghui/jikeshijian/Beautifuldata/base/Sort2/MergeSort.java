package com.chenghui.jikeshijian.Beautifuldata.base.Sort2;

public class MergeSort {

    //归并排序算法，a是数组，n表示数组大小
   public void mergeSort(int[] a, int n){
       mergeSortInternally(a,0,n-1);
   }

    //递归调用函数
    private void mergeSortInternally(int[] a, int p, int r) {
        //递归终止条件
        if(p>=r)return;

        int q = p+(r-p)/2;
        //递归调用
        mergeSortInternally(a,p,q);
        mergeSortInternally(a,q+1,r);

        merge(a,p,q,r);

    }

    private void merge(int[] a, int p, int q, int r) {
       int i = p;
       int j = q+1;
       //新数组的指针
       int k = 0;
       //定义一个新数组 存两个数组合并后的结果
        int[] tmp = new int[r-p+1];
       while(i<=q && j<=r){
           if(a[i]<=a[j]){
               tmp[k++] = a[i++];
           }else{
               tmp[k++] = a[j++];
           }
       }

       //判断哪个数组中还有数据
        int start = i;
        int end = q;
        if(j<=r){
           start = j;
           end = r;
        }

        //将剩余的数据赋值到tmp数组中
        while(start<=end){
            tmp[k++] = a[start];
        }

        //将新的数组赋值回原数组
        for(i = 0;i<=r-p;i++){
            a[p+i] = tmp[i];
        }
    }




    /**
     * 合并（哨兵）
     */
    private static void mergeBySentry(int[] arr,int p ,int q,int r){
        int[] leftArr = new int[q-p+2];
        int[] rightArr = new int[r-q+1];



        for(int i = 0;i<q-p+1;i++){
            leftArr[i] = arr[p+i];
        }
        //给左边加哨兵
        leftArr[q-p+1] = Integer.MAX_VALUE;

        for(int j = 0;j<r-q;j++){
            rightArr[j] = arr[q+1+j];
        }
        //给右边加哨兵
        rightArr[r-q] = Integer.MAX_VALUE;

        int i = 0;
        int j = 0;
        int k = p;
        while(k<=r){
            if(rightArr[i]<leftArr[j]){
                arr[k++] = rightArr[i++];
            }else{
                arr[k++] = leftArr[j++];
            }
        }


    }
}
