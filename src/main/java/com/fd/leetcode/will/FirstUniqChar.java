package com.fd.leetcode.will;

import java.util.HashMap;

/**
 * @author will
 * @date 2022-04-10 23:16
 */
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        HashMap<Character, Boolean> map = new HashMap<>();

        for (char aChar : chars) {
            if (map.containsKey(aChar)) map.put(aChar, false);
            else map.put(aChar, true);
        }

        for (char aChar : chars) {
            if (map.get(aChar)) return aChar;
        }
        return ' ';
    }
}
