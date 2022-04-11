package main.java.com.fd.leetcode.bolukezz;

import main.java.com.fd.leetcode.common.ListNode;

import java.util.HashSet;

/**
 * @author zhuyumeng
 * @date 2022/4/11 10:58 上午
 */
public class IntersectionNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        while (headA != null) {
            set.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (set.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
