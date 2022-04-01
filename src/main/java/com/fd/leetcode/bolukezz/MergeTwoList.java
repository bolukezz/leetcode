package main.java.com.fd.leetcode.bolukezz;

import com.fd.leetcode.common.ListNode;

/**
 * @author zhuyumeng
 * @date 2022/4/1 10:20 上午
 */
public class MergeTwoList {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        while (l1 != null) {
            cur.next = l1;
            l1=l1.next;
            cur=cur.next;
        }
        while (l2 != null) {
            cur.next = l2;
            l2=l2.next;
            cur=cur.next;
        }
        return dummy.next;
    }
}
