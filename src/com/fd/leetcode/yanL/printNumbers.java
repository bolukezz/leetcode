package com.fd.leetcode.yanL;

public class printNumbers {

    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 3; i++) {
            num *= 10;
        }
        System.out.println(num);
    }

    public static int[] Solution(int n) {
        int num = 1;
        for (int i = 0; i < n; i++) {
            num *= 10;
        }
        int[] res = new int[num - 1];
        for (int i = 1; i <= num - 1; i++) {
            res[i - 1] = i;
        }
        return res;
    }

}
