package main.java.com.fd.leetcode.yanL;


import main.java.com.fd.leetcode.common.ListNode;

public class DeleteNode {


    public static ListNode Solution(ListNode head, int val) {
        ListNode cur = head;
        if (cur.val == val) {
            return cur.next;
        }
        while (cur.next.val != val) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
        return head;
    }

}
