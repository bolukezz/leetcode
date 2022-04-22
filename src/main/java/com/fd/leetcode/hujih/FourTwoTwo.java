package com.fd.leetcode.hujih;

/**
 * @description:
 * @author: hjh
 * @date:2022-04-22 17:03
 **/
public class FourTwoTwo {
    public int lastRemaining(int n, int m) {
        return f(n, m);
    }

    public int f(int n, int m) {
        if (n == 1) {
            return 0;
        }
        int x = f(n - 1, m);
        return (m + x) % n;
    }
}
