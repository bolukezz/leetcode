package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author will
 * @date 2022-05-31 23:23
 */
public class HasCycle {
    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }
}
