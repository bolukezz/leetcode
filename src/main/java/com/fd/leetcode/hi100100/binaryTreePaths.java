package main.java.com.fd.leetcode.hi100100;

import main.java.com.fd.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhoudj
 * @data 2022/5/8  21:41
 */
public class binaryTreePaths {
    List<String> res = new ArrayList<>();
    StringBuilder path = new StringBuilder();

    public List<String> binaryTreePaths(TreeNode root) {
        dfs(root);
        return res;
    }

    private void dfs(TreeNode root) {
        if (root == null) return;

        int t = path.length();
        path.append(root.val);

        if (root.left == null && root.right == null)
            res.add(path.toString());

        path.append("->");
        dfs(root.left);
        dfs(root.right);
        path.delete(t, path.length());
    }
}
