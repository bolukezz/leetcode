package main.java.com.fd.leetcode.bolukezz;

import java.util.Arrays;

/**
 * @author zhuyumeng
 * @date 2022/4/7 10:12 上午
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
