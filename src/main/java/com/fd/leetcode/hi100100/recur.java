package main.java.com.fd.leetcode.hi100100;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author zhoudj
 * @data 2022/4/16  20:37
 */
public class recur {
    public boolean isBalanced(TreeNode root) {
        return recur(root) != -1;
    }

    private int recur(TreeNode root) {
        if (root == null) return 0;
        int left = recur(root.left);
        if(left == -1) return -1;
        int right = recur(root.right);
        if(right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }
}
