package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-20 23:05
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int m = 0, n = 1;
        while (n < len){
            if (nums[m] == nums[n]){
                n++;
            }else {
                nums[++m] = nums[n++];
            }
        }
        return m + 1;
    }
}
