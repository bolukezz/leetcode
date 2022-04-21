package main.java.com.fd.leetcode.bolukezz;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zhuyumeng
 * @date 2022/4/19 9:33 下午
 */
public class ReverseWords {
    public String reverseWords(String s) {
        String[] str = s.trim().split("  ");
        Deque<String> stack = new LinkedList<>();
        Arrays.stream(str).filter(el -> el.length() > 0 && el.substring(0, 1) != " ").forEach(stack::push);
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.poll() + " ");
        }
        return sb.toString().trim();
    }
}
