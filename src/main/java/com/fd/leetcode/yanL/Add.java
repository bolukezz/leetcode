package main.java.com.fd.leetcode.yanL;

public class Add {
    public static void main(String[] args) {
        System.out.println(Add.solution(1, 2));
    }
    public static int solution(int a, int b) {
        while (b != 0) {
            int n = (a & b) << 1;
            a = a ^ b;
            b = n;
        }
        return a;
    }
}
