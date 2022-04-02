package main.java.com.fd.leetcode.bolukezz;


import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author zhuyumeng
 * @date 2022/3/28 10:03 上午
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        while (cur.next != null) {
            if (cur.next.val == val) {
                cur.next = cur.next.next;
                break;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
