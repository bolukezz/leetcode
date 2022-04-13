package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-13 22:14
 */
public class MissingNumber {
    public int missingNumber(int[] nums) {
        int l = 0, r = nums.length - 1;
        int p;

        /**
         * nums[p] = p   [p+1,r]
         * nums[p] > p   [l,p-1]
         * nums[p] < p   [l,p-1]
         */
        while (l <= r) {
            p = (l + r) >> 1;
            if (nums[p] == p) l = p + 1;
            else r = p - 1;
        }
        return l;
    }
}
