package main.java.com.fd.leetcode.bolukezz;

import java.util.Arrays;

/**
 * @author zhuyumeng
 * @date 2022/4/19 10:11 上午
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int res = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                int curGap = Math.abs(sum - target);
                int minGap = Math.abs(target - res);
                if (curGap < minGap) {
                    res = sum;
                }
                if (sum > target) {
                    k--;
                } else if (sum < target) {
                    j++;
                }else{
                    return res;
                }
            }
        }
        return res;
    }
}
