package com.fd.leetcode.will;

/**
 * 时间复杂度为n中存在 1 的个数，平均时间复杂度 O(logn)？ 我不理解...
 * @author will
 * @date 2022-03-26 21:41
 */
public class HammingWeight {
    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            // n & (n-1) 结果为最右侧1位置开始置为0
            n &= (n - 1);
            res++;
        }
        return res;
    }
}
