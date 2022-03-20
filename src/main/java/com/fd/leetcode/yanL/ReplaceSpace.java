package com.fd.leetcode.yanL;

public class ReplaceSpace {
    public static void main(String[] args) {
        System.out.println(ReplaceSpace.solution("1 , 2 33123 ni "));
    }

    public static String solution(String str) {
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                res.append("%20");
            } else {
                res.append(str.charAt(i));
            }
        }
        return res.toString();
    }

}
