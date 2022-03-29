package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-03-29 21:36
 */
public class SwapElement {
    public int[] exchange(int[] nums) {
        int len = nums.length;
        int s = 0, f = 0, temp;
        while (f < len){
            if (nums[f] % 2 != 0) {
                temp = nums[s];
                nums[s] = nums[f];
                nums[f] = temp;
                f++;
                s++;
                continue;
            }
            f++;
        }
        return nums;
    }
}
