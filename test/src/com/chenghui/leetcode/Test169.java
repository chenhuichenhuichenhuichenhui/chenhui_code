package com.chenghui.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test169 {
    public static int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        return candidate;
    }

    public static void main(String[] args) {
        int [] arr = {7,7,5,4,6,7,2};
        System.out.println(majorityElement(arr));
        Map<String,Object> map = new HashMap<>();
        List<String> list = new ArrayList<>();

    }

}
