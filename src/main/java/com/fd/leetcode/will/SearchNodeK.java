package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-03-30 20:45
 */
public class SearchNodeK {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode s = head;
        ListNode f = head;

        for (int i = 0; i < k; i++) {
            f = f.next;
        }
        while (f != null){
            f = f.next;
            s = s.next;
        }

        return s;
    }
}
