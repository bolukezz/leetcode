package main.java.com.fd.leetcode.bolukezz;

import java.util.Arrays;

/**
 * @author zhuyumeng
 * @date 2022/5/6 22:04
 */
public class ContainsDuplicateNum {
    class Solution {
        public boolean containsDuplicate(int[] nums) {
            Arrays.sort(nums);
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] == nums[i - 1]) { }
                return true;
            }
            return false;
        }
    }
}
