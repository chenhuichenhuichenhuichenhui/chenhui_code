package com.chenghui.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个范围在  1 ≤ a[i] ≤ n ( n = 数组大小 ) 的 整型数组，数组中的元素一些出现了两次，另一些只出现一次。
 *
 * 找到所有在 [1, n] 范围之间没有出现在数组中的数字。
 *
 */
public class Test448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        // if(nums.empty()) return nums;
        for(int i=0;i<nums.length;i++)
        {
            //因为nums[index]+n了，所以得%nums.size();
            int index=(nums[i]-1)%nums.length;
            nums[index]+=nums.length;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<=nums.length) {
                res.add(i + 1);
            }
        }
        return res;
    }
}
