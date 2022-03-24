package com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/3/24 10:07 上午
 */
public class FrogJumpStep {
    public int numWays(int n) {
        int p = 1;
        int v = 1;
        int sum = 0;
        if (n == 0 || n == 1) {
            return p;
        }
        for (int i = 2; i <= n; i++) {
            sum = (p + v) % 1000000007;
            p = v;
            v = sum;
        }
        return sum;
    }
}
