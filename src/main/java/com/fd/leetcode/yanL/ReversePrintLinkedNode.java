package com.fd.leetcode.yanL;

import com.fd.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

public class ReversePrintLinkedNode {
    public static void main(String[] args) {

    }

    public static int[] solution(ListNode head) {
        List<Integer> list = new ArrayList<>();
        ListNode cur = head;
        while (cur != null) {
            list.add(cur.val);
            cur = cur.next;
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(list.size() - 1 - i);
        }
        return res;
    }
}
