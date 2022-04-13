package main.java.com.fd.leetcode.hi100100;

/**
 * @author zhoudj
 * @data 2022/4/13  16:00
 */
public class missingNumber {
    public int missingNumber(int[] nums) {
        int i = 0, j = nums.length - 1;
        while(i <= j) {
            int m = (i + j) / 2;
            if(nums[m] == m) {
                i = m + 1;
            }
            else {
                j = m - 1;
            }
        }
        return i;
    }
}
