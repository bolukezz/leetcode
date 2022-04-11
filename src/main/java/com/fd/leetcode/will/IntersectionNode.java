package com.fd.leetcode.will;

import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author will
 * @date 2022-04-11 22:09
 */
public class IntersectionNode {
    public main.java.com.fd.leetcode.common.ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode node1 = headA;
        ListNode node2 = headB;
        while (node1 != node2){
            node1 = node1 == null ? headB : node1.next;
            node2 = node2 == null ? headA : node2.next;
        }
        return node1;
    }
}
