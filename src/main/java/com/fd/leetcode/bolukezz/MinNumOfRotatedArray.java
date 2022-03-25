package com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/3/25 10:13 上午
 */
public class MinNumOfRotatedArray {
    public int minArray(int[] numbers) {
        int minNum = Integer.MAX_VALUE;
        for (int number : numbers) {
            minNum = Math.min(minNum, number);
        }
        return minNum;
    }
    //todo  晚上补上二分解法
}
