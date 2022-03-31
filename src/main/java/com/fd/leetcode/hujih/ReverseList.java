package com.fd.leetcode.hujih;

import com.fd.leetcode.common.ListNode;

/**
 * @description:
 * @author: hjh
 * @date:2022-03-31 22:01
 **/
public class ReverseList {

    public ListNode reverseList(ListNode head) {
        ListNode cur = head,
                last = null;
        while (cur != null) {
            ListNode listNode = cur.next;
            //修改下个指向
            cur.next = last;
            //存当前节点
            last = cur;
            cur = listNode;
        }
        return last;
    }
}
