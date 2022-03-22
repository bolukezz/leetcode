package com.fd.leetcode.yanL;

import java.util.ArrayDeque;

class CQueue {


    private ArrayDeque<Integer> s1 = new ArrayDeque<>();

    private ArrayDeque<Integer> s2 = new ArrayDeque<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.isEmpty() ? -1 : s2.pop();
    }
}
