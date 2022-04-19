package main.java.com.fd.leetcode.yanL;

import java.util.Stack;

public class ReverseWords {
    public static String solution(String s) {
        String[] s1 = s.trim().split(" ");
        Stack<String> stack = new Stack<String>();
        for (String s2 : s1) {
            if (s2.length() > 0 && s2.substring(0, 1) != " ") {
                stack.push(s2);
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            String s3 = stack.pop();
            sb.append(s3 + " ");
        }
        return sb.toString().trim();
    }
}
