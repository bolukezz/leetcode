package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * @author zhuyumeng
 * @date 2022/5/8 22:12
 */
public class BinaryTreePath {
    public List<String> binaryTreePaths(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<String> res = new ArrayList<>();
        dfs(root, res, "");
        return res;
    }

    private void dfs(TreeNode root, List<String> res, String path) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            res.add(path + root.val);
            return;
        }

        dfs(root.left, res,   path+root.val+"->");
        dfs(root.right, res,   path+root.val+"->");
    }
}
