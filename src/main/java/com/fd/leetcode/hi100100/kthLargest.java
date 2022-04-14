package main.java.com.fd.leetcode.hi100100;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author zhoudj
 * @data 2022/4/14  16:08
 */
public class kthLargest {
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
