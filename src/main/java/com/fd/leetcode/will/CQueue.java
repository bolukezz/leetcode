package com.fd.leetcode.will;

import java.util.Stack;

/**
 * @author will
 * @date 2022-03-22 22:11
 */
public class CQueue {
    Stack<Integer> stackAppend, stackDelete;

    public CQueue() {
        stackAppend = new Stack<>();
        stackDelete = new Stack<>();
    }

    public void appendTail(int value) {
        stackAppend.push(value);
    }

    public int deleteHead() {
        if (stackDelete.empty()){
            while (!stackAppend.empty()){
                stackDelete.push(stackAppend.pop());
            }
        }
        return stackDelete.empty() ? -1 : stackDelete.pop();
    }
}

/**
 * Your CQueue object will be instantiated and called as such:
 * CQueue obj = new CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */