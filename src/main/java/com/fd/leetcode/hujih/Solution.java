package com.fd.leetcode.hujih;

import java.util.HashMap;
import java.util.Map;

/**
 * @description:
 * @author: hjh
 * @date:2022-03-23 19:16
 **/
public class Solution {

    Map<Integer,Integer> hashMap = new HashMap<>();

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        //递归存入 n-1 和 n-2
        if (hashMap.get(n) != null) {
            return hashMap.get(n);
        }
        //递归查询n-1 和n-2
        int sum = (fib(n-1)+fib(n-2)) % 1000000007;
        hashMap.put(n,sum);
        return sum;
    }
}
