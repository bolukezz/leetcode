package com.fd.leetcode.hi100100;

/**
 * @author Administrator
 * @data 2022/3/27  17:19
 */
public class printNumbers {
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++)
            res[i] = i + 1;
        return res;
    }
    //todo 好方法上班在研究
}
