package main.java.com.fd.leetcode.bolukezz;

import java.util.*;

/**
 * @author zhuyumeng
 * @date 2022/5/12 22:50
 */
public class ValidBrackets {
    public static void main(String[] args) {
        boolean valid = new ValidBrackets().isValid("()");
    }
    public boolean isValid(String s) {
        List<String> right = Arrays.asList(")", "}", "]");
        List<String> pair = Arrays.asList("()", "{}", "[]");
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            boolean flag = false;
            String str = String.valueOf(c);
            if (right.contains(str)) {
                if (!stack.isEmpty()) {
                    Character temp = stack.peek();
                    if (pair.contains(String.valueOf(temp) + String.valueOf(c))) {
                        flag = true;
                        stack.pop();
                    }
                }
            }
            if (!flag) {
                stack.add(c);
            }
        }
        return stack.isEmpty();
    }
}
