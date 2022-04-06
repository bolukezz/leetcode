package com.fd.leetcode.will;

import java.util.Stack;

/**
 * @author will
 * @date 2022-04-05 20:01
 */
public class MinStack {
    Stack<Integer> a;
    Stack<Integer> b;

    /** initialize your data structure here. */
    public MinStack() {
        a = new Stack<Integer>();
        b = new Stack<Integer>();
    }

    public void push(int x) {
        a.push(x);
        if (b.empty() || b.peek() >= x){
            b.push(x);
        }
    }

    public void pop() {
        if(a.pop().equals(b.peek())){
            b.pop();
        }
    }

    public int top() {
        return a.peek();
    }

    public int min() {
        return b.peek();
    }
}