package main.java.com.fd.leetcode.hi100100;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author zhoudj
 * @data 2022/4/24  17:17
 */
public class lowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if (left != null && right != null) {
            return root;
        } else if (left == null && right != null) {
            return right;
        } else if (left != null && right == null) {
            return left;
        } else if (left == null && right == null) {
            return null;
        }
        return null;
    }
}
