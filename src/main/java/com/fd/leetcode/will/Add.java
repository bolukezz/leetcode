package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-23 21:43
 */
public class Add {
    public int add(int a, int b) {
        while (b != 0){
            int n = (a & b) << 1;
            a = a ^ b;
            b = n;
        }
        return a;
    }
}
