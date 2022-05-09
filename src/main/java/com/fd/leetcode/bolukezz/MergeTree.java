package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author zhuyumeng
 * @date 2022/5/9 23:01
 */
public class MergeTree {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null || t2 == null) {
            return t1 == null ? t2 : t1;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(t1);
        queue.add(t2);
        while (!queue.isEmpty()) {
            TreeNode temp1 = queue.poll();
            TreeNode temp2 = queue.poll();
            temp1.val += temp2.val;
            if (temp1.left != null && temp2.left != null) {
                queue.add(temp1.left);
                queue.add(temp2.left);
            } else {
                if (temp1.left == null) {
                    temp1.left = temp2.left;
                }
            }
            if (temp1.right != null && temp2.right != null) {
                queue.add(temp1.right);
                queue.add(temp2.right);
            } else {
                if (temp1.right == null) {
                    temp1.right = temp2.right;
                }
            }
        }
        return t1;
    }
}
