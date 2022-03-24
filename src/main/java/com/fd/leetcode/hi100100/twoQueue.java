package com.fd.leetcode.hi100100;

import java.util.LinkedList;

/**
 * @author Administrator
 * @data 2022/3/22  10:49
 */
class twoQueue {
    LinkedList<Integer> a,b;
    public twoQueue() {
        a = new LinkedList<>();
        b = new LinkedList<>();
    }

    public void appendTail(int value) {
        a.addLast(value);
    }

    public int deleteHead() {
        if (!b.isEmpty()) {
            return b.removeLast();
        }
        if (a.isEmpty()) {
            return -1;
        }
        while (!a.isEmpty()) {
            b.addLast(a.removeLast());
        }
        return b.removeLast();
    }
}
