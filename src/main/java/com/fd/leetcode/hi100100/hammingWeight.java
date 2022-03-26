package com.fd.leetcode.hi100100;

/**
 * @author Administrator
 * @data 2022/3/26  16:54
 */
public class hammingWeight {
    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }

}
