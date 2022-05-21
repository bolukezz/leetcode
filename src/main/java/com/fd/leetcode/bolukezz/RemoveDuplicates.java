package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/5/21 13:16
 */
public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int len = nums.length;
        int slow = 0;
        int fast = 1;
        while (fast < len) {
            if (nums[slow] != nums[fast]) {
                slow++;
                nums[slow] = nums[fast];
            }
            fast++;
        }
        return slow+1;
    }
}
