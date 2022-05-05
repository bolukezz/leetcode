package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author zhuyumeng
 * @date 2022/5/5 7:11 下午
 */
public class MergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null) {
            return null;
        }
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode dummy = new ListNode(0);
        ListNode res = list1.val < list2.val ? list1 : list2;
        dummy.next = res;
        if (res == list1) {
            list1 = list1.next;
        } else {
            list2 = list2.next;
        }
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                res.next = list1;
                list1 = list1.next;
            } else {
                res.next = list2;
                list2 = list2.next;
            }
            res = res.next;
        }
        while (list1 != null) {
            res.next = list1;
            list1 = list1.next;
            res = res.next;
        }
        while (list2 != null) {
            res.next = list2;
            list2 = list2.next;
            res = res.next;
        }
        return dummy.next;
    }
}
