package com.fd.leetcode.hujih;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @description: 双栈实现队列
 * @author: hjh
 * @date:2022-03-22 10:19
 **/
public class DoubleStack {
    Deque<Integer> stackOne;
    Deque<Integer> stackTwo;

    /**
     * 声明队列
     */
    void CQueue() {
        stackOne = new LinkedList<>();
        stackTwo = new LinkedList<>();
    }

    /**
     * 向栈一中推入数据
     * @param value
     */
    void appendTail(int value) {
        stackOne.push(value);
    }

    /**
     * 栈二负责删除 由于栈的原理是先进后出，想删除首插入的数据 需要将栈一的数据转移到栈二  在进行pop取出操作
     * @return
     */
    int deleteHead() {
        while (!stackOne.isEmpty()){
            stackTwo.push(stackOne.pop());
        }
        if(stackTwo.isEmpty()){
            return -1;
        }else {
            return stackTwo.pop();
        }
    }

    public static void main(String[] args) {
        DoubleStack doubleStack = new DoubleStack();
        doubleStack.CQueue();
        doubleStack.appendTail(21);
        int i = doubleStack.deleteHead();
        System.out.println(i);
    }
}
