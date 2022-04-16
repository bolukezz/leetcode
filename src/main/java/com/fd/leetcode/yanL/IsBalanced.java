package main.java.com.fd.leetcode.yanL;

import main.java.com.fd.leetcode.common.TreeNode;

public class IsBalanced {
    public boolean solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(depth(root.left) - depth(root.right)) <= 1 && solution(root.left) && (solution(root.right));
    }

    public int depth(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(depth(node.left), depth(node.right)) + 1;
    }
}

