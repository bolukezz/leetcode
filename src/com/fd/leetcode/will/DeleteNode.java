package com.fd.leetcode.will;

import com.fd.leetcode.common.ListNode;

/**
 * @author will
 * @date 2022-03-28 23:08
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode pre = new ListNode(0);
        pre.next = head;
        ListNode slow = pre;
        ListNode fast = head;

        while (fast != null) {
            if (fast.val == val) {
                slow.next = fast.next;
            }
            slow = slow.next;
            fast = fast.next;
        }
        return pre.next;
    }
}
