package main.java.com.fd.leetcode.yanL;


import main.java.com.fd.leetcode.common.ListNode;

public class ReverseNode {

    public static void main(String[] args) {

    }

    public static ListNode solution(ListNode head) {
        if (head == null) return null;
        ListNode pre = null;
        ListNode cur = head;
        if (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

}
