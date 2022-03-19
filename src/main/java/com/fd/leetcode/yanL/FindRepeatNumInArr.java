package com.fd.leetcode.yanL;

import java.util.HashSet;

public class FindRepeatNumInArr {
    public static void main(String[] args) {
        System.out.println(FindRepeatNumInArr.solution(new int[]{1, 2, 2, 4, 5, 6, 7, 8, 9, 8}));
    }

    public static int solution(int[] arr) {
        // 利用hashSet判断是否重复
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int v = arr[i];
            // 返回false 则v为重复数字
            if (!set.add(v)) return v;
        }
        return -1;
    }

}
