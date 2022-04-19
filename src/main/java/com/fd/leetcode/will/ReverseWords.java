package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-04-19 23:05
 */
public class ReverseWords {
    public String reverseWords(String s) {
        char[] chars = s.trim().toCharArray();
        String newS = s.trim();
        StringBuilder res = new StringBuilder();

        for (int fast = chars.length - 1, slow = chars.length - 1; fast >= 0; ) {
            // 非空格
            while (fast >= 0 && chars[fast] != ' ') {
                fast--;
            }
            res.append(newS, fast+1, slow+1);
            // 空格
            if (fast >= 0) res.append(chars[fast--]);
            // 跳过多余空格
            while (fast >= 0 && chars[fast] == ' ') {
                fast--;
            }
            // 重置
            slow = fast;
        }
        return res.toString();
    }
}
