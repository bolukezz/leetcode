package com.fd.leetcode.yanL;

public class NumWays {

    public static void main(String[] args) {

    }

    public static int Solution(int n) {
        int a = 1, b = 1, sum;
        for (
                int i = 0;
                i < n; i++) {
            sum = (a + b) % 1000000007;
            a = b;
            b = sum;
        }
        return a;
    }
}
