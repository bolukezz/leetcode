package com.fd.leetcode.hujih;

import java.util.*;

/**
 * @description:
 * @author: hjh
 * @date:2022-04-06 18:34
 **/
public class levelOrder {

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] vec = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;
    }
}
