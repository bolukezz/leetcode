package com.fd.leetcode.will;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author will
 * @date 2022-05-13 23:38
 */
public class Intersect {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> tmp = new ArrayList<>();
        int i = nums1.length - 1, j = nums2.length - 1, p = 0;
        while (i >= 0 && j >= 0) {
            if (nums1[i] == nums2[j]) {
                tmp.add(nums1[i]);
                i--;
                j--;
            } else if (nums1[i] > nums2[j]) {
                i--;
            } else {
                j--;
            }
        }
        int[] ans = tmp.stream().mapToInt(Integer::valueOf).toArray();
        return ans;
    }
}
