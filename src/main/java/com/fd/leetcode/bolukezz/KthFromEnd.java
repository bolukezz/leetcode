package main.java.com.fd.leetcode.bolukezz;

import com.fd.leetcode.common.ListNode;


/**
 * @author zhuyumeng
 * @date 2022/3/30 10:01 上午
 */
public class KthFromEnd {
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode slow = head, fast = head;
        while (--k > 0) {
            fast = fast.next;
        }
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }
}
