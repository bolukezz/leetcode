package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/4/22 6:33 下午
 */
public class ClosedLsLand {
    public int closedIsland(int[][] arr) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    res++;
                    dfs(arr, i, j);
                }
            }
        }
        return res;
    }

    private void dfs(int[][] arr, int row, int col) {
        if (row < 0 || row > arr.length || col < 0 || col > arr[row].length) {
            return;
        }
        arr[row][col] = 1;
        dfs(arr, row - 1, col);
        dfs(arr, row + 1, col);
        dfs(arr, row, col - 1);
        dfs(arr, row, col + 1);
    }
}
