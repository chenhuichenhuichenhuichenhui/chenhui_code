package com.chenghui.Algorithms.Part1;

public class BinarySearch {
    public static int rank(int key,int[] a){
        int lo = 0;
        int hi = a.length;
        while(lo<=hi){
            int mid  = (hi+lo)/2;
            if(key<a[mid]){hi = mid -1;}
            else if (key>a[mid]){lo = mid +1;}
            else{
                return mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
