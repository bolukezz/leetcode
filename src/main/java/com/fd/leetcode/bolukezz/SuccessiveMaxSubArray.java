package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/5/9 22:52
 */
public class SuccessiveMaxSubArray {
    public int maxSubArray(int[] nums) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum > res) {
                res = sum;
            }
            sum = sum < 0 ? 0 : sum;
        }
        return res;
    }
}
