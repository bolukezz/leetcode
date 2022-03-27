package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-03-27 18:07
 */
public class PrintNumbers {
    public int[] printNumbers(int n) {
        int capacity = (int)Math.pow(10, n);

        int[] res = new int[capacity - 1];
        for (int i = 1; i < capacity; i++) {
            res[i-1] = i;
        }
        return res;
    }
}
