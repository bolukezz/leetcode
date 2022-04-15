package main.java.com.fd.leetcode.yanL;

import main.java.com.fd.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class MaxDepth {
    public int solution(TreeNode root) {
        int size = 0;
        if (root == null) {
            return size;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int length = queue.size();
            for (int i = 0; i < length; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            size++;
        }
        return size;
    }
}
