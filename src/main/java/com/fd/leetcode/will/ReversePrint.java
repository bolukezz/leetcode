package com.fd.leetcode.will;

import com.fd.leetcode.common.ListNode;

import java.util.LinkedList;

/**
 * @author will
 * @date 2022-03-21 21:59
 */
public class ReversePrint {
    public int[] reversePrint(ListNode head) {
        LinkedList<Integer> temp = new LinkedList<>();

        while (head!= null){
            temp.add(head.val);
            head = head.next;
        }
        int[] res = new int[temp.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = temp.removeLast();
        }
        return res;
    }
}
