package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-03-24 23:14
 */
public class numWays {
    // TODO
    public int numWays(int n) {
        int a = 1, b = 1, sum;
        for(int i = 0; i < n; i++){
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
