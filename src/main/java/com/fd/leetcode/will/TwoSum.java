package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-17 21:47
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int l=0, r=nums.length-1, s;
        while (l<=r){
            s = nums[l] + nums[r];
            if (s == target) break;
            if (s > target){
                r--;
            }else {
                l++;
            }
        }
        return new int[]{nums[l],nums[r]};
    }
}
