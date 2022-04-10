package main.java.com.fd.leetcode.bolukezz;

import java.util.HashMap;

/**
 * @author zhuyumeng
 * @date 2022/4/10 11:20 下午
 */
public class FirstUniqChar {
    public char firstUniqChar(String s) {
        int[] arr = new int[26];
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            arr[idx]++;
        }
        for (char c : s.toCharArray()) {
            if (arr[c - 'a'] == 1) {
                return c;
            }
        }
        return ' ';
    }

}
