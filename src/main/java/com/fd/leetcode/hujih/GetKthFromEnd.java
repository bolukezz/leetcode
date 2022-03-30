package com.fd.leetcode.hujih;

import com.fd.leetcode.common.ListNode;

/**
 * @description:
 * @author: hjh
 * @date:2022-03-30 18:30
 **/
public class GetKthFromEnd {

    public ListNode getKthFromEnd(ListNode head, int k) {
        int n = 0;
        ListNode node = null;
        for (node = head; node != null; node = node.next) {
            n++;
        }
        for (node = head; n > k; n--) {
            node = node.next;
        }
        return node;
    }

}
