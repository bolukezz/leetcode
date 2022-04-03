package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-04-03 15:45
 */
public class IsSymmetric {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;

        return recursion(root.left, root.right);
    }

    private boolean recursion(TreeNode n1, TreeNode n2){
        if(n1 == null && n2 == null) return true;
        if(n1 == null || n2 == null) return false;

        if(n1.val == n2.val){
            return recursion(n1.left, n2.right) && recursion(n1.right, n2.left);
        }

        return false;
    }

}
