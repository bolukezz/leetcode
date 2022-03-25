package com.fd.leetcode.yanL;

public class MinNumInArr {

    public static int Solution(int[] arr) {
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minNum > arr[i]) minNum = arr[i];
        }
        return minNum;
    }

}
