package com.chenghui.leetcode;

public class Test189 {
    public static void rotate(int[] nums, int k) {
        int len = nums.length;
        int[] res = new int[len];
        k=(k>=len)?k%len:k;
        System.arraycopy(nums,len-k,res,0,k);
        System.arraycopy(nums,0,res,k,len-k);
        System.arraycopy(res,0,nums,0,len);
        for (int i = 0; i < res.length; i++) {
            System.out.print(nums[i]+"  ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        rotate(arr,3);
    }
}
