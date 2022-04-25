package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-25 22:29
 */
public class FindNumberIn2DArray {
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix.length == 0) return false;
        int l = matrix[0].length - 1, h = 0, height = matrix.length - 1;

        while (l >= 0 && h <= height) {
            if (matrix[h][l] > target) {
                l--;
                continue;
            }

            if (matrix[h][l] < target) {
                h++;
                continue;
            }
            return true;
        }
        return false;
    }
}
