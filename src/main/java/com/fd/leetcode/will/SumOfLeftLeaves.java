package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-16 21:29
 */
public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(main.java.com.fd.leetcode.common.TreeNode root) {
        if (root == null) return 0;

        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }

        sum += sumOfLeftLeaves(root.left);

        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
