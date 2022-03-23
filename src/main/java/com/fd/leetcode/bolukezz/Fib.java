package com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/3/23 10:37 上午
 */
public class Fib {
    public int fib(int n) {
        int p = 0;
        int v = 1;
        int sum = 0;
        if (n == 1) {
            return 1;
        }
        for (int i = 2; i <= n; i++) {
            sum = (p + v) % 1000000007;
            p = v;
            v = sum;
        }
        return sum;
    }
}
