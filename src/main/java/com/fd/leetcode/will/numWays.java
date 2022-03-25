package com.fd.leetcode.will;

import java.util.HashMap;
import java.util.Map;

/**
 * @author will
 * @date 2022-03-24 23:14
 */
public class numWays {
    // 递归 + 记忆搜索
    Map<Integer, Integer> mem = new HashMap<>();

    public int numWays(int n) {

        if (n < 2) return 1;

        if (mem.containsKey(n)) {
            return mem.get(n);
        }

        int n1 = numWays(n - 1) % 1000000008;
        mem.put(n - 1, n1);

        int n2 = numWays(n - 2) % 1000000008;
        mem.put(n - 2, n2);

        int res = (n1 + n2) % 1000000008;
        mem.put(n, n1 + n2);
        return res;
    }
}
