package com.chenghui.leetcode;

public class Test27 {
        public static int removeElement(int[] nums, int val) {
            int flag = nums.length - 1;
            for (int i = 0; i <= flag; i++) {
                if (nums[i] == val) {
                    int temp = nums[i];
                    nums[i] = nums[flag];
                    nums[flag] = temp;
                    flag--;
                    i--;
                }
            }
            for(int i=0;i<=flag;i++){
                System.out.println(nums[i]);
            }
            System.out.println("================================");
            return flag+1;
        }
    public static void main (String[] args){
        int[] nums = {3,2,2,3};
        System.out.println(removeElement(nums,3));
    }
}
