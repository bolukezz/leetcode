package com.fd.leetcode.bolukezz;

import java.util.LinkedList;
import java.util.List;

/**
 * @author zhuyumeng
 * @date 2022/3/22 10:00 上午
 */
public class SimulationOfQueue {
    LinkedList<Integer> stack1;
    LinkedList<Integer> stack2;

    public SimulationOfQueue() {
        stack1 = new LinkedList<>();
        stack2 = new LinkedList<>();
    }

    public void appendTail(int value) {
        stack1.addLast(value);
    }

    public int deleteHead() {
        if (!stack2.isEmpty()) {
            return stack2.pollLast();
        }
        if (stack1.isEmpty()) {
            return -1;
        }
        while (!stack1.isEmpty()) {
            Integer pollEl = stack1.pollLast();
            stack2.addLast(pollEl);
        }
        return stack2.pollLast();
    }
}
