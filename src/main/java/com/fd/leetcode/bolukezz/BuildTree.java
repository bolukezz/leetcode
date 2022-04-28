package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.TreeNode;

import java.util.Arrays;

/**
 * @author zhuyumeng
 * @date 2022/4/28 4:42 下午
 */
public class BuildTree {
    //todo 太累了先cv，明天早晨写写看。
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int length = preorder.length;
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            return new TreeNode(preorder[0]);
        }
        //确定根节点
        TreeNode root = new TreeNode(preorder[0]);
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (inorder[i] == preorder[0]) {
                //在中序列表里查找根元素下标
                index = i;
            }
        }
        //取出左子树的前序遍历
        int[] leftPreOrder = Arrays.copyOfRange(preorder, 1, index + 1);
        //取出左子树的中序遍历
        int[] leftInOrder = Arrays.copyOfRange(inorder, 0, index);
        //生成左子树
        root.left = buildTree(leftPreOrder, leftInOrder);

        //取出右子树的前序遍历列表
        int[] rightPreOrder = Arrays.copyOfRange(preorder, index + 1, length);
        //取出右子树的中序遍历列表
        int[] rightInOrder = Arrays.copyOfRange(inorder, index + 1, length);
        //生成右子树
        root.right = buildTree(rightPreOrder, rightInOrder);
        return root;
    }
}
