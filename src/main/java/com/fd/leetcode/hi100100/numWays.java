package main.java.com.fd.leetcode.hi100100;

import java.util.HashMap;

/**
 * @author Administrator
 * @data 2022/3/24  10:14
 */
public class numWays {
    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public static int fib(int n) {
        if (n <= 1){
            return 1;
        }
        if (n <= 3){
            return n;
        }
        if (map.get(n)==null){
            map.put(n,(fib(n-1) + fib(n-2))%1000000007);
        }
        return map.get(n);
    }
}
