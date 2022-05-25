package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-25 22:47
 */
public class CanConstruct {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] hashtable = new int[26];
        for (char c : magazine.toCharArray()) {
            hashtable[c - 'a']++;
        }
        for (char c : ransomNote.toCharArray()) {
            hashtable[c - 'a']--;
            if (hashtable[c - 'a'] < 0) {
                return false;
            }
        }
        return true;
    }
}
