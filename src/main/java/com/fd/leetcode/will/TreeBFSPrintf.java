package com.fd.leetcode.will;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-04-06 22:05
 */
public class TreeBFSPrintf {
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) queue.add(root);

        List<List<Integer>> res = new ArrayList<>();

        while (!queue.isEmpty()) {
            // 存放每一层
            ArrayList<Integer> temp = new ArrayList<>();

            for (int i = queue.size(); i > 0; i--) {
                // 出队列
                TreeNode node = queue.poll();
                // 打印值
                temp.add(node.val);
                // 遍历子节点
                if (node.left != null) queue.add(node.left);
                if (node.right != null) queue.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}
