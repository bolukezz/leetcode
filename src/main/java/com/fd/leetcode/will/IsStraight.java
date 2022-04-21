package com.fd.leetcode.will;

import java.util.HashSet;

/**
 * @author will
 * @date 2022-04-21 22:15
 */
public class IsStraight {
    public boolean isStraight(int[] nums) {
        int max = 13, min = 0;
        HashSet<Integer> set = new HashSet<>();
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 0) continue;
            if (set.contains(nums[i])) return false;
            set.add(nums[i]);
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }
        return (max - min) < 5;
    }
}
