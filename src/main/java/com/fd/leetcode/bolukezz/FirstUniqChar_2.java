package main.java.com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/5/20 10:06
 */
public class FirstUniqChar_2 {
    public int firstUniqChar(String s) {
        int[] chars = new int[26];
        for (char c : s.toCharArray()) {
            int idx = c - 'a';
            chars[idx] = chars[idx] > 0 ? chars[idx]++ : 1;
        }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = c - 'a';
            if (chars[idx] == 1) {
                return i;
            }
        }
        return -1;
    }
}
