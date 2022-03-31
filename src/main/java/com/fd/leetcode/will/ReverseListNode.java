package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-03-31 21:18
 */
public class ReverseListNode {
    public ListNode reverseList(ListNode head) {
        if (head == null) return head;

        ListNode p = head;
        ListNode m;
        while (head.next != null) {
            // 遍历
            m = head.next;
            // 反转
            head.next = m.next;
            m.next = p;
            // 重置
            p = m;
        }
        return p;
    }
}
