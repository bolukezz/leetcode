package main.java.com.fd.leetcode.hi100100;

import com.fd.leetcode.common.ListNode;

/**
 * @author Administrator
 * @data 2022/3/28  10:17
 */
public class deleteNode {
    public ListNode deleteNode(ListNode head, int val) {
        if (head == null) return null;
        if (head.val == val) return head.next;
        ListNode cur = head;
        //查找到被删除元素
        while (cur.next != null && cur.next.val != val){
            cur = cur.next;
        }
        //删除元素
        if (cur.next != null)
            cur.next = cur.next.next;
        return head;
    }
}
