package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-24 21:51
 */
public class SetZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean column0 = false; // 标记第一列是否存在0元素

        // 标记
        for (int i = 0; i < m; i++) {
            // 用第一列标[i][0]记每一行是否存在0
            if (matrix[i][0] == 0) column0 = true;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] == 0) {
                    // 用第一行和第一列标记 每行列是否存在0
                    // 第一列被修改，已有column0做标记；而第一行被修改，且本身就应该本修改
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        // 置0  (第一列不参与)(注意，因为第一行也被作为标记行，不能提前置0)
        for (int i = m-1; i >= 0; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }
        // 第一列置0
        if (column0){
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }
    }
}
