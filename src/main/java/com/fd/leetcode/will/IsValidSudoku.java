package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-23 22:14
 */
public class IsValidSudoku {
    public boolean isValidSudoku(char[][] board) {
        int[][] rows = new int[9][9]; // 行 哈希表
        int[][] columns = new int[9][9]; // 列 哈希表
        /**
         * 将9*9 分为 3个3*9 即 3*3*9  哈希表
         * 从左至右，从上至下，每个3*3方框的的任一哈希值v，存放在 [i/3][j/3][v]
         * 第一个3*3方框的哈希值v放在 [0][0][v]
         * 第二个3*3方框的哈希值v放在 [0][1][v]
         * 第三个3*3方框的哈希值v放在 [0][2][v]
         * 第四个3*3方框的哈希值v放在 [1][0][v]
         * 第五个3*3方框的哈希值v放在 [1][1][v]
         * 第六个3*3方框的哈希值v放在 [1][2][v]
         * 第七个3*3方框的哈希值v放在 [2][0][v]
         * 第八个3*3方框的哈希值v放在 [2][1][v]
         * 第九个3*3方框的哈希值v放在 [2][2][v]
         */
        int[][][] boxs = new int[3][3][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    // char 与 int 计算，char默认用ASCII码计算，0 ASCII码 为48，故 -'0'
                    int index = board[i][j] - '0' - 1;
                    // 存放 行 哈希表
                    if (rows[i][index] == 1) return false;
                    rows[i][index] = 1;
                    // 存放 列 哈希表
                    if (columns[index][j] == 1) return false;
                    columns[index][j] = 1;
                    // 存放 三位数组哈希表
                    if (boxs[i/3][j/3][index] == 1) return false;
                    boxs[i/3][j/3][index] = 1;
                }
            }
        }
        return true;
    }
}
