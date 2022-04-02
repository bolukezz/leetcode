package main.java.com.fd.leetcode.hi100100;

import main.java.com.fd.leetcode.common.ListNode;

import java.util.Stack;

/**
 * @author Administrator
 * @data 2022/3/21  11:27
 */
public class reversePrint {
    public int[] reversePrint(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        ListNode temp = head;
        while (temp != null){
            stack.add(temp);
            temp = temp.next;
        }
        int size = stack.size();
        int[] val = new int[size];
        for (int i = 0; i < size; i++) {
            val[i] = stack.pop().val;
        }
        return val;
    }
}
