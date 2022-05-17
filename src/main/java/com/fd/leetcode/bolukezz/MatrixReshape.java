package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/5/17 22:10
 */
public class MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] res = new int[r][c];
        if (mat.length * mat[0].length != r * c) {
            return mat;
        }
        int idx = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                res[idx / c][idx % c] = mat[i][j];
                idx++;
            }
        }
        return res;
    }
}
