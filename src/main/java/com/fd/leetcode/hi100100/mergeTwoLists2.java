package main.java.com.fd.leetcode.hi100100;

import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author zhoudj
 * @data 2022/5/5  17:10
 */
public class mergeTwoLists2 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode res = l1.val < l2.val ? l1 : l2;
        res.next = mergeTwoLists(res.next, l1.val >= l2.val ? l1 : l2);
        return res;
    }
}
