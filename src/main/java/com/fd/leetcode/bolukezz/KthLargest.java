package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * @author zhuyumeng
 * @date 2022/4/14 10:06 上午
 */
public class KthLargest {
    List<TreeNode> nodes = new ArrayList<>();

    public int kthLargest(TreeNode root, int k) {
        inOrder(root);
        int idx = nodes.size() - k;
        return nodes.get(idx).val;
    }

    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        nodes.add(root);
        inOrder(root.right);
    }
}
