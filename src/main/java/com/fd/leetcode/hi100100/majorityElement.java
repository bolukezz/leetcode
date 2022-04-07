package main.java.com.fd.leetcode.hi100100;

import java.util.Arrays;

/**
 * @author zhoudj
 * @data 2022/4/7  15:59
 */
public class majorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
