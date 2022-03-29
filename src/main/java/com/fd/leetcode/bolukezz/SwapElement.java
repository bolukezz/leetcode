package main.java.com.fd.leetcode.bolukezz;

import java.util.Arrays;

/**
 * @author zhuyumeng
 * @date 2022/3/29 10:23 上午
 */
public class SwapElement {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new SwapElement().exchange(new int[] {1, 2, 3, 4})));
    }

    public int[] exchange(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            while (left < right && nums[left] % 2 != 0)
                left++;
            while (left < right && nums[right] % 2 == 0)
                right--;
            swap(nums, left, right);
        }
        return nums;
    }

    public void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }
}
