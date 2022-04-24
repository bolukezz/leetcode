package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.TreeNode;

/**
 * @author zhuyumeng
 * @date 2022/4/24 10:16 上午
 */
public class LowestCommonAncestor {
    public TreeNode p(TreeNode root, TreeNode p, TreeNode q) {
        while (root != null) {
            if (p.val < root.val && q.val < root.val) {
                root = root.left;
            } else if (q.val > root.val && q.val > root.val) {
                root = root.right;
            }else {
                break;
            }
        }
        return root;
    }
}
