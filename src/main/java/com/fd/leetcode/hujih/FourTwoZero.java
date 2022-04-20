package com.fd.leetcode.hujih;

/**
 * @description:
 * @author: hjh
 * @date:2022-04-20 10:45
 **/
public class FourTwoZero {
    public String reverseLeftWords(String s, int n) {
        String substring = s.substring(n);
        String s1 = substring + s;
        return s1.substring(0,s.length());
    }
}
