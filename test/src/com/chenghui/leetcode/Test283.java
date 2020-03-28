package com.chenghui.leetcode;

public class Test283 {
    public static void moveZeroes(int[] nums) {
        int count = 0;
        int i = 0;
        for(int j = 0 ; j<nums.length;j++){
            if(nums[j]!=0){
                nums[i]=nums[j];
                i++;
            }else {
                count++;
            }
        }
        System.out.println(count);
        for(int m = 0 ; m<count ; m++){
            nums[nums.length-1-m]=0;
        }

    }

    public static void main(String[] args) {
        int[] sums = {0,1,0,3,12};
        moveZeroes(sums);
    }
}
