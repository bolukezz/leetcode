package com.fd.leetcode.bolukezz;

/**
 * @author zhuyumeng
 * @date 2022/3/20 1:21 下午
 */
public class replaceSpace {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (c == ' ') {
                sb.append("%20");
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
