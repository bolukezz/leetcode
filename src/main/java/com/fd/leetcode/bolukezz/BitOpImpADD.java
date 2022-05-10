package main.java.com.fd.leetcode.bolukezz;


/**
 * @author zhuyumeng
 * @date 2022/4/23 4:42 下午
 */
public class BitOpImpADD {
    public int add(int a, int b) {
        int carry;
        while(b != 0) {
            a = a^b;
            b = (a & b) << 1;
        //    a = c;
        }
        return a;
    }
}
