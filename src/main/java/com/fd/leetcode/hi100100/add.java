package main.java.com.fd.leetcode.hi100100;

/**
 * @author zhoudj
 * @data 2022/4/23  19:47
 */
public class add {
    public int add(int a, int b) {
        while(b != 0) {
            int c = (a & b) << 1;
            a ^= b;
            b = c;
        }
        return a;
    }
}
