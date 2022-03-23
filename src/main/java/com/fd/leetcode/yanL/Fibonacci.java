package com.fd.leetcode.yanL;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {
    public static void main(String[] args) {

    }

    static Map<Integer, Integer> map = new HashMap();

    public static int solution(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (map.containsKey(n)) return map.get(n);
        int res = solution(n - 1) + solution(n - 2);
        map.put(n, res);
        return res;
    }

}
