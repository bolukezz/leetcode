package main.java.com.fd.leetcode.hi100100;

/**
 * @author zhoudj
 * @data 2022/4/10  8:10
 */
public class maxSubArray {
        public int maxSubArray(int[] nums) {
            int res = nums[0];
            for(int i = 1; i < nums.length; i++) {
                nums[i] += Math.max(nums[i - 1], 0);
                res = Math.max(res, nums[i]);
            }
            return res;
        }

}
