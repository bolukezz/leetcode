package main.java.com.fd.leetcode.yanL;


import java.util.ArrayList;
import java.util.List;

import main.java.com.fd.leetcode.common.TreeNode;

public class BinaryTreePaths {
    public List<String> solution(TreeNode root) {
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

