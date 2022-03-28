package com.fd.leetcode.hujih;

import com.fd.leetcode.common.ListNode;

/**
 * @description:
 * @author: hjh
 * @date:2022-03-28 13:50
 **/
public class DeleteNode {

    public ListNode deleteNode(ListNode head, int val) {
        //判断要删除的不是head节点
        if (head.val == val) {
            return head.next;
        }
        //设置两个节点 上个节点 和当前节点
        ListNode preNode = head;
        ListNode curNode = head.next;
        //遍历 后继节点为空或者是找到val
        while (curNode != null && curNode.val != val) {
            preNode = curNode;
            curNode = curNode.next;
        }
        //后继节点不为空，修改指向
        if (curNode != null){
            preNode.next = curNode.next;
        }
        //返回head
        return head;
    }
}
