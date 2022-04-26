package com.fd.leetcode.will;

import java.util.HashMap;
import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-04-26 22:57
 */
public class BuildTree {
    HashMap<Integer, Integer> inorderMap = new HashMap<>(); // 代替了从中序数组查找节点划分的过程
    int[] preorder;

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        this.preorder = preorder;
        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }
        return recursionBuild(0, 0, inorder.length - 1);
    }

    private TreeNode recursionBuild(int root, int left, int right) {
        if (left > right) return null; // 不存在子节点
        TreeNode node = new TreeNode(preorder[root]);
        int nodeInorderIndex = inorderMap.get(preorder[root]); // 当前根节点在中序数组中的索引
        node.left = recursionBuild(root + 1, left, nodeInorderIndex - 1);
        // 在前序遍历数组中 右子节点下标表示为：当前根节点下标 + 左子树长度（nodeInorderIndex - left） + 1
        node.right = recursionBuild(root + (nodeInorderIndex - left) + 1, nodeInorderIndex + 1, right);
        return node;
    }
}
