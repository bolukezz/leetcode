package main.java.com.fd.leetcode.yanL;

import com.fd.leetcode.common.ListNode;

public class GetKthFromEnd {

    public static ListNode solution(ListNode head, int k) {
        ListNode fast = head,slow = head;
        for (int i = 0; i <k ; i++) {
            slow=slow.next;
        }
        while (slow!=null){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }

}
