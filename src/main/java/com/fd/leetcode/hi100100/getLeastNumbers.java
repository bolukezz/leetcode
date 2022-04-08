package main.java.com.fd.leetcode.hi100100;

import java.util.Arrays;

/**
 * @author zhoudj
 * @data 2022/4/8  16:21
 */
public class getLeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] vec = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < k; ++i) {
            vec[i] = arr[i];
        }
        return vec;
    }
}
