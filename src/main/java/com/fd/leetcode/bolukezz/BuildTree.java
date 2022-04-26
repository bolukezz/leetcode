package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author zhuyumeng
 * @date 2022/4/26 10:07 上午
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return dfs(0, 0, inorder.length - 1, preorder, inorder);
    }

    public TreeNode dfs(int root, int left, int right, int[] preorder, int[] inorder) {
        if (left > right) {
            return null;
        }
        int preVal = preorder[root];
        TreeNode curRoot = new TreeNode(preorder[root]);
        int idx = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (preVal == inorder[i]) {
                idx = i;
                break;
            }
        }
        dfs(root + 1, left, idx - 1, preorder, inorder);
        dfs(root + idx - left + 1, idx + 1, right, preorder, inorder);

        return curRoot;
    }
}

