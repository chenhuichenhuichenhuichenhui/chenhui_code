package com.chenghui.leetcode;

import java.util.ArrayList;
import java.util.List;

public  class Test26 {
        public int removeDuplicates2(int[] nums) {
            // 使用双指针
            if(nums==null || nums.length == 1){
                return nums.length;
            }
            int i = 0,j =1;
            while(j<nums.length){
                if(nums[i]==nums[j]){
                    j++;
                }else{
                    i++;
                    nums[i]=nums[j];
                    j++;
                }
            }
            return i+1;
        }
    public static int removeDuplicates(int[] nums) {

        int flag = nums.length-1 ;
        for(int i =1;i<=flag;i++){
            for(int j=i-1;j>=0;j--){
                if(nums[i]==nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[flag];
                    nums[flag] = temp;
                    flag--;
                    i--;
                    break;
                }
            }
        }
        for(int i=0;i<flag;i++) {
            for (int j = i + 1; j < flag + 1; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return flag+1;
    }
    public static void main (String[] args){
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
        List<String> list = new ArrayList<>();
    }

}
