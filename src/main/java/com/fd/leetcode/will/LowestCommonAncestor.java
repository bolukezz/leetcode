package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-04-24 23:34
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (p.val < root.val & q.val < root.val) return lowestCommonAncestor(root.left, p, q);
        if (p.val > root.val & q.val > root.val) return lowestCommonAncestor(root.right, p, q);
        return root;
    }
}
