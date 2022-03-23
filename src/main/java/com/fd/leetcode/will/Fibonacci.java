package com.fd.leetcode.will;

import java.util.HashSet;
import java.util.Set;

/**
 * @author will
 * @date 2022-03-23 19:56
 */
public class Fibonacci {
    public static int fib(int n) {
        if (n < 2) return n;
        int p = 0, q = 0, r = 1;
        for (int i = 2; i <= n; i++) {
            p = q;
            q = r;
            r = (p + q) % 1000000007;
        }
        return r;
    }

    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
