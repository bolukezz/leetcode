package com.fd.leetcode.will;

import java.util.ArrayList;
import java.util.List;
import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author will
 * @date 2022-05-08 22:01
 */
public class BinaryTreePaths {
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> res = new ArrayList<>();
        recursion(res, "", root);
        return res;
    }

    private void recursion(List<String> res, String path, TreeNode node) {
        if (node != null) {
            path = path + node.val;

            if (node.left == null && node.right == null) {
                res.add(path);
            }
            path = path + "->";
            recursion(res, path, node.left);
            recursion(res, path, node.right);
        }
    }
}
