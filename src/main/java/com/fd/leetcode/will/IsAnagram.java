package com.fd.leetcode.will;

import java.util.Arrays;

/**
 * @author will
 * @date 2022-05-30 20:58
 */
public class IsAnagram {
    // 少量数据 速度比哈希快
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] str1 = s.toCharArray();
        char[] str2 = t.toCharArray();
        Arrays.sort(str1);
        Arrays.sort(str2);
        return Arrays.equals(str1, str2);
    }
}
