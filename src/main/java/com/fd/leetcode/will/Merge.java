package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-11 21:54
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m + n - 1, s1 = m - 1, s2 = n - 1; i >= 0; i--) {
            if (s1 == -1) {
                nums1[i] = nums2[s2--];
            } else if (s2 == -1) {
                nums1[i] = nums1[s1--];
            } else if (nums1[s1] > nums2[s2]) {
                nums1[i] = nums1[s1--];
            } else {
                nums1[i] = nums2[s2--];
            }
        }
    }
}
