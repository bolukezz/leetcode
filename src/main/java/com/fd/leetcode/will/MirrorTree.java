package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-04-02 21:51
 */
public class MirrorTree {
    public TreeNode mirrorTree(TreeNode root) {
        recursion(root);
        return root;
    }

    private void recursion(TreeNode node) {
        if (node == null) return;

        TreeNode temp;
        // 左右交换
        temp = node.left;
        node.left = node.right;
        node.right = temp;

        // 递归子节点
        recursion(node.left);
        recursion(node.right);
    }
}

