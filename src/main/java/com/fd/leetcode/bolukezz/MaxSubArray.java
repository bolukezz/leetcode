package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/4/10 12:12 上午
 */
public class MaxSubArray {
    public int maxSubArray(int[] nums) {
        int ans = 0;
        if (nums.length == 0) {
            return ans;
        }
        if (nums.length == 1) {
            return nums[0];
        }
         ans = nums[0];
        for (int i = 1; i < nums.length; i++) {
           if(nums[i-1]>0){
               nums[i] += nums[i - 1];
           }else{

           }
        }
    }
}
