package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-12 22:21
 */
public class SearchNumber {
    public int search(int[] nums, int target) {
        int len = nums.length;
        int l = 0, r = len - 1;
        int pivot = 0;

        // 右边界
        while (l <= r) {
            pivot = (l + r) >> 1;
            if (nums[pivot] <= target) l = pivot + 1;
            else r = pivot - 1;
        }
        int right = l;

        l = 0;
        r = len - 1;
        // 左边界
        while (l <= r) {
            pivot = (l + r) >> 1;
            if (nums[pivot] < target) l = pivot + 1;
            else r = pivot - 1;
        }
        int left = l;

        return right - left;
    }
}
