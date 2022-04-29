package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/4/28 9:38 下午
 */
public class MoveCount {
    int m, n, k;
    boolean[][] visited;

    public int movingCount(int m, int n, int k) {
        this.m = m;
        this.n = n;
        this.k = k;
        visited = new boolean[m][n];
        return recur(0, 0, 0, 0);
    }

    private int recur(int i, int j, int iSumOfDigits, int jSumOfDigits) {
        if (i >= m || j >= n || iSumOfDigits + jSumOfDigits > k || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        int l = recur(i + 1, j, (i + 1) % 10 != 0 ? iSumOfDigits + 1 : iSumOfDigits - 8, jSumOfDigits);
        int r = recur(i, j + 1, iSumOfDigits, (j + 1) % 10 != 0 ? jSumOfDigits + 1 : jSumOfDigits - 8);
        return 1 + l + r;
    }

}
