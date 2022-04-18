package com.fd.leetcode.will;

import java.util.ArrayList;
import java.util.List;

/**
 * @author will
 * @date 2022-04-18 23:27
 */
public class FindContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        int i = 1, j = 1, sum = 0, mid = target/2;
        List<int[]> res = new ArrayList<>();

        while (i <= mid) {
            if (sum < target) {
                sum += j;
                j++;
            } else if (sum > target) {
                sum -= i;
                i++;
            } else {
                int[] arr = new int[j-i];
                for (int k = i; k < j; k++) {
                    arr[k-i] = k;
                }
                res.add(arr);
                sum -= i;
                i++;
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
