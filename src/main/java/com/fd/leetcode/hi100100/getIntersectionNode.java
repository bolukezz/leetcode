package main.java.com.fd.leetcode.hi100100;

import main.java.com.fd.leetcode.common.ListNode;

/**
 * @author zhoudj
 * @data 2022/4/11  15:41
 */
public class getIntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }
        ListNode pA = headA, pB = headB;
        while (pA != pB) {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
        }
        return pA;
    }
}
