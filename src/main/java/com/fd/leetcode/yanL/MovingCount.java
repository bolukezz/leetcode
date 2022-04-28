package main.java.com.fd.leetcode.yanL;

public class MovingCount {
    int result = 0;

    public int movingCount(int m, int n, int k) {
        booMovingCountlean[][] help = new boolean[m][n];
        dfs(help, 0, 0, k);
        return result;
    }

    public void dfs(boolean[][] help, int i, int j, int k) {
        if (i < 0 || i >= help.length || j < 0 || j >= help[0].length || help[i][j] || getSum(i, j) > k) {
            return;
        }
        help[i][j] = true;
        result++;
        dfs(help, i - 1, j, k);
        dfs(help, i + 1, j, k);
        dfs(help, i, j - 1, k);
        dfs(help, i, j + 1, k);
    }

    public int getSum(int i, int j) {
        return (i == 100 ? 1 : (i / 10 + i % 10)) + (j == 100 ? 1 : (j / 10 + j % 10));
    }
}
