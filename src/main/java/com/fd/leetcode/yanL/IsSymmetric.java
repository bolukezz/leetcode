package main.java.com.fd.leetcode.yanL;

import main.java.com.fd.leetcode.common.TreeNode;

public class IsSymmetric {

    public boolean solution(TreeNode root) {
        if(root==null) return true;
        return recur(root.left,root.right);
    }

    boolean recur(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        if(left==null||right==null) return false;
        if(left.val!=right.val) return false;
        return recur(left.left,right.right)&&recur(left.right,right.left);
    }

}
