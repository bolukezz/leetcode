package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-03-20 15:32
 */
public class ReplaceSpace {
    class Solution {
        public String replaceSpace(String s) {
            StringBuilder stringBuilder = new StringBuilder();
            char[] chars = s.toCharArray();
            for (char c :
                    chars) {
                if (c == ' ') stringBuilder.append("%20");
                else stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }
    }
}
