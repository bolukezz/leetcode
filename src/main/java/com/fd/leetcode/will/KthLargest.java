package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-04-15 0:21
 */
public class KthLargest {
    // TODO
    int res, k;
    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        dfs(root);
        return res;
    }
    void dfs(TreeNode root) {
        if(root == null) return;
        dfs(root.right);
        if(k == 0) return;
        if(--k == 0) res = root.val;
        dfs(root.left);
    }
}
