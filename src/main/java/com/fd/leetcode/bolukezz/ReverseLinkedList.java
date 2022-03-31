package main.java.com.fd.leetcode.bolukezz;

import com.fd.leetcode.common.ListNode;

/**
 * @author zhuyumeng
 * @date 2022/3/31 10:01 上午
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode cur = head, pre = null;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}
