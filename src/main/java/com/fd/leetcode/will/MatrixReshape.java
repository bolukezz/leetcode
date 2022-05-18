package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-18 22:30
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) return mat;

        int[][] ans = new int[r][c];
        // 用m*n得到元素个数，第i个元素在两个数组中的位置也就可以表示出来
        for (int i = 0; i < m * n; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }

        return ans;
    }
}
