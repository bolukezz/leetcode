package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-19 21:57
 */
public class _FirstUniqChar {
    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[26];
        int n = s.length();
        for (int i = 0; i < n; i++) {
            arr[chars[i] - 'a']++;
        }
        for (int i = 0; i < n; i++) {
            if (arr[chars[i] - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
}
