package com.chenghui.leetcode;

public class Test53 {
    public int maxSubArray2(int[] nums){
        int sum=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            if(sum<0&&nums[i]>sum) {
                sum = 0;
                sum += nums[i];
                max = Math.max(sum, max);
            }
        }

        return max;
    };

    public static int maxSubArray(int[] nums) {
        int start=0;
        int end=1;
        int sum = nums[start];
        while(end<nums.length){
            if(sum<sum+nums[end]){
                sum+=nums[end];
                end++;
            }
            if(start<end && sum<sum-nums[start]){
                sum-=nums[start];
                start++;
            }
        }
        System.out.println(start+"============="+end);
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};

        System.out.println(maxSubArray(nums));
    }
}
