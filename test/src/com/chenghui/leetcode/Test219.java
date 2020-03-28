package com.chenghui.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Test219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        String a = "";
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            if(!map.containsKey(nums[i])){
                map.put(nums[i],i);
            }else{
                if(i-map.get(nums[i])<=k){
                    return true;
                }else{
                    map.put(nums[i],i);
                }
            }
        }
        return false;
    }
}
