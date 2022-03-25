package com.fd.leetcode.will;

/**
 * 二分法 特殊场景应用
 *
 * @author will
 * @date 2022-03-25 21:43
 */
public class BinarySearch {
    public int minArray(int[] numbers) {
        int l = 0, r = numbers.length - 1, mid = 0;
        while (l < r) {
            mid = (l + r) >> 1;
            if (numbers[mid] > numbers[r]) {
                l = mid + 1;
            } else if (numbers[mid] < numbers[r]) {
                r = mid;
            } else {
                // 有可能多个元素重复
                r--;
            }
        }
        return numbers[l];
    }
}
