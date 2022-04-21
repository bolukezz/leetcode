package main.java.com.fd.leetcode.yanL;

import java.util.Arrays;

public class IsStraight {
    public static boolean solution(int[] nums) {
        if (nums.length <= 0) {
            return false;
        }
        Arrays.sort(nums);
        int zeroCnt = 0;
        for (int i = 0; i < 4; i++) {
            if (nums[i] == 0) {
                zeroCnt++;
            } else if (nums[i] == nums[i + 1]) {
                return false;
            }
        }
        return nums[4] - nums[zeroCnt] <= 4;
    }
}
