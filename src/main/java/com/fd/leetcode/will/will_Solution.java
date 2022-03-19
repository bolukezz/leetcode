package com.fd.leetcode.will;

import java.util.HashSet;

/**
 * @author will
 * @description
 * @create 2022-03-19 12:32
 */
public class will_Solution {
    public int findRepeatNumber_1(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] array = new int[]{2, 3, 1, 0, 2, 5, 3};
        will_Solution solution = new will_Solution();
        System.out.println(solution.findRepeatNumber_1(array));
    }
}
