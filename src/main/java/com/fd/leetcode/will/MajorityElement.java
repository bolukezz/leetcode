package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-07 23:24
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int x = 0, s = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (s == 0) {
                x = nums[i];
            }
            s += x == nums[i] ? 1 : -1;
        }
        return x;
    }
}
