package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-20 21:00
 */
public class ReverseLeftWords {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }
}
