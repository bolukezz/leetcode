package com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/3/26 5:38 下午
 */
public class hammingWeight {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            res += n & 1;
            n >>>= 1;
        }
        return res;
    }
}
