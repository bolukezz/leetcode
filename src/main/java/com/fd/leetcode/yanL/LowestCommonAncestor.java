package main.java.com.fd.leetcode.yanL;

import main.java.com.fd.leetcode.common.TreeNode;

public class LowestCommonAncestor {
    public static TreeNode solution(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = solution(root.left, p, q);
        TreeNode right = solution(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left == null && right != null) {
            return right;
        } else if (left != null) {
            return left;
        } else {
            return null;
        }
    }
}
