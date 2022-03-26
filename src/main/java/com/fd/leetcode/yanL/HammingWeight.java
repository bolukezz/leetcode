package com.fd.leetcode.yanL;

public class HammingWeight {

    public static void main(String[] args) {
        // 1010
        System.out.println(HammingWeight.solution(10));
    }

    public static int solution(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & (1 << i)) != 0) {
                res++;
            }
        }
        return res;
    }


}
