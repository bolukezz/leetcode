package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author zhuyumeng
 * @date 2022/4/20 5:48 下午
 */
public class LevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            int curSize = queue.size();
            List<Integer> curLevel = new ArrayList<>();
            for (int i = 0; i < curSize; i++) {
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
                curLevel.add(node.val);
            }
            res.add(curLevel);
        }
        return res;
    }
}
