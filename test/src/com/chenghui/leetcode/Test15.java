package com.chenghui.leetcode;

import java.util.*;

public class Test15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums==null || nums.length<3){
            return res;
        }
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){return res;}
            if(i>0 && nums[i]==nums[i-1]){continue;}

            int l = i+1;
            int r = nums.length-1;
            while(l<r){
                int sum = nums[i]+nums[l]+nums[r];
                if(sum ==0){

                    res.add(Arrays.asList(nums[i],nums[l],nums[r]));
                    while(nums[l]==nums[l+1]){l++;}
                    while(nums[r]==nums[r-1]){r--;}
                    l++;
                    r--;

                }else if(sum>0){
                    r--;
                }else{l++;}
            }

        }
        return res;
    }

    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        sb.append("aaa");
        System.out.println(sb);
    }
}
