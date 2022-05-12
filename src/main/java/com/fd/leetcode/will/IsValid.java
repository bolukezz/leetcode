package com.fd.leetcode.will;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author will
 * @date 2022-05-12 22:37
 */
public class IsValid {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('{', '}');
        map.put('[', ']');

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (stack.size() != 0 && map.get(stack.peek()) != null
                    && map.get(stack.peek()) == chars[i]) {
                stack.pop();
                continue;
            }
            stack.push(chars[i]);
        }
        return stack.size() == 0;
    }
}
