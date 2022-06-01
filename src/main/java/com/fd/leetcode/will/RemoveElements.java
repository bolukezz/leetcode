package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author will
 * @date 2022-06-01 23:15
 */
public class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode node = pre;

        while (node.next != null){
            if (node.next.val == val){
                node.next = node.next.next;
            }else {
                node = node.next;
            }
        }
        return pre.next;
    }
}
