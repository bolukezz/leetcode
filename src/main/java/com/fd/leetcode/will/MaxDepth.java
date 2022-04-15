package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-04-15 23:11
 */
public class MaxDepth {
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        } else {
            int left = maxDepth(root.left);
            int right = maxDepth(root.right);
            return Math.max(left, right) + 1;
        }
    }
}
