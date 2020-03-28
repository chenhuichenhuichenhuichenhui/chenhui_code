package com.chenghui.jikeshijian.Beautifuldata.base.sort3;

/**
 * 桶排序算法
 */
public class BucketSort {
    /**
     * 桶排序
     * @param arr 数组
     * @param bucketSize 桶容量
     */
    public static void bucketSort(int[] arr,int bucketSize){
        if(arr.length < 2){
            return;
        }

        //数组最小值
        int minValue = arr[0];
        //数组最大值
        int maxValue = arr[1];
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < minValue){
                minValue = arr[i];
            }else if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }

        //桶数量
        int bucketCount = (maxValue - minValue)/bucketSize+1;
        int[][] buckets = new int[bucketCount][bucketSize];
        int[] indexArr = new int[bucketCount];

        //将数组中值分配到各个桶里
        for(int i = 0;i<arr.length;i++){
            int bucketIndex = (arr[i]-minValue)/bucketSize;
            if(indexArr[bucketIndex] == buckets[bucketIndex].length){
               // ensureCapacity(buckets,bucketIndex);
            }
            buckets[bucketIndex][indexArr[bucketIndex]++] = arr[i];
        }

        //对每个桶进行排序，这里使用了快速排序
        int k = 0;
        for(int i = 0;i<buckets.length;i++){
            if(indexArr[i] == 0){
                continue;
            }

        }



    }
}
