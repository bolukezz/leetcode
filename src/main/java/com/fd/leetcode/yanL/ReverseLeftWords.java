package main.java.com.fd.leetcode.yanL;

public class ReverseLeftWords {
    public static String solution(String s, int n) {
        return s.substring(n) + s.substring(0,n);
    }
}
