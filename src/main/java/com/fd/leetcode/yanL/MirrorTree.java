package main.java.com.fd.leetcode.yanL;

import main.java.com.fd.leetcode.common.TreeNode;

public class MirrorTree {

    public static void main(String[] args) {

    }

    public TreeNode solution(TreeNode root) {
        if (root == null) return null;
        TreeNode tmp = root.left;
        root.left = solution(root.right);
        root.right = solution(tmp);
        return root;
    }

}
