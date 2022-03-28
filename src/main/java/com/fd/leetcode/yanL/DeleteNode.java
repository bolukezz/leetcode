package main.java.com.fd.leetcode.yanL;

import com.fd.leetcode.common.*;

public class DeleteNode {


    public static ListNode Solution(ListNode head, int val) {
        if (head.val==val)return null;
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
