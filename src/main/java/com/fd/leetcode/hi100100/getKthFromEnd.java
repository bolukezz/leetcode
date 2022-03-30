package main.java.com.fd.leetcode.hi100100;

import com.fd.leetcode.common.ListNode;

/**
 * @author zhoudj
 * @data 2022/3/30  14:35
 */
public class getKthFromEnd {
    //输入一个链表，输出该链表中倒数第k个节点。为了符合大多数人的习惯，本题从1开始计数，即链表的尾节点是倒数第1个节点。
    public static ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        int count = 0;
        while (former!=null){
            former = former.next;
            count++;
        }
        for (int i = 0; i < count - k; i++) {
            head = head.next;

        }
        return head;
    }

    public static void main(String[] args) {
        ListNode a1 = new ListNode(1);
        ListNode a2 = new ListNode(2);
        ListNode a3 = new ListNode(3);
        ListNode a4 = new ListNode(4);
        ListNode a5 = new ListNode(5);
        ListNode a6 = new ListNode(6);
        a1.next = a2;
        a2.next = a3;
        a3.next = a4;
        a4.next = a5;
        a5.next = a6;

        ListNode kthFromEnd = getKthFromEnd(a1, 2);
        System.out.println(kthFromEnd.val);

    }
}
