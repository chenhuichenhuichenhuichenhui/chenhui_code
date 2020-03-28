package com.chenghui.leetcode;

public class Test485 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxc = 0;
        int count = 0;
        for(Integer num:nums){
            if(num==0) {
                maxc = Math.max(maxc,count);
                count=0;
            }else{
                ++count;
            }

        }
        return maxc;
    }

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
