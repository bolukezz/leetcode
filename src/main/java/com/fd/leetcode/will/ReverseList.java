package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author will
 * @date 2022-06-06 22:42
 */
public class ReverseList {
    // 栈操作
    // 迭代
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null){
            ListNode next = curr.next;
            curr.next = pre;
            pre = curr;
            curr = next;
        }
        return pre;
    }
}
