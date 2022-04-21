package main.java.com.fd.leetcode.bolukezz;

import java.util.HashSet;
import java.util.Set;

/**
 * @author zhuyumeng
 * @date 2022/4/17 2:49 下午
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> numOfScans = new HashSet<>();
        for (int num : nums) {
            if (numOfScans.contains(target - num)) {
                return new int[] {num, target - num};
            }
            numOfScans.add(num);
        }
        return new int[] {-1, -1};
    }
}
