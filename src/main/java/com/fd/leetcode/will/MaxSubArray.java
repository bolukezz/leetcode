package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-09 21:53
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = nums[0];
        int len = nums.length;
        for (int i = 1; i < len; i++) {
            if (nums[i - 1] > 0)
                nums[i] += nums[i - 1];
            res = Math.max(res, nums[i]);
        }
        return res;
    }

    public int maxSubArray_2(int[] nums) {
        int pre = 0, maxAns = nums[0];
        for (int x : nums) {
            pre = Math.max(pre + x, x);
            maxAns = Math.max(maxAns, pre);
        }
        return maxAns;
    }
}
