package main.java.com.fd.leetcode.yanL;

import main.java.com.fd.leetcode.common.ListNode;

public class MergeNode {

    public static void main(String[] args) {

    }

    public static ListNode solution(ListNode l1,ListNode l2){
        ListNode head = new ListNode(0);
        ListNode cur = head;
        ListNode temp;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                temp = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                temp = new ListNode(l1.val);
                l1 = l1.next;
            }
            cur.next = temp;
            cur = cur.next;
        }
        while (l1 != null) {
            temp = new ListNode(l1.val);
            l1 = l1.next;
            cur.next = temp;
            cur = cur.next;
        }
        while (l2 != null) {
            temp = new ListNode(l2.val);
            l2 = l2.next;
            cur.next = temp;
            cur = cur.next;
        }
        return head.next;
    }
}
