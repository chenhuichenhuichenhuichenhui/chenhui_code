package com.chenghui.leetcode;

public class Test88 {
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int p = m-- + n-- - 1;
        while (m >= 0 && n >= 0) {
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        }

        while (n >= 0) {
            nums1[p--] = nums2[n--];
        }
    }
    public static void merge(int[] nums1,int m, int[] nums2, int n) {
        if(m==0){
            for(int i = 0;i<n;i++){
                nums1[i] = nums2[i];
            }
        }else{
            int i = m-1;
            int j = n-1;
            int k = m+n-1;
            while(j>=0) {
                if (nums2[j] > nums1[i]) {
                    nums1[k] = nums2[j];
                    k--;
                    j--;
                } else {
                    nums1[k] = nums1[i];
                    i--;
                    while(i<0 && j>=0){
                        k--;
                        nums1[k] = nums2[j];
                        j--;
                    }
                    k--;

                }
            }
        }
  }



    public static void main(String[] args) {
        int[] a = {0};
        int[] b = {1};
        //merge(a,0,b,1);
        for(Integer i:a){
            System.out.println(i);
        }
    }

}
