package com.fd.leetcode.hi100100;

import java.util.HashMap;

/**
 * @author Administrator
 * @data 2022/3/23  9:59
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }
    static HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
    public static int fib(int n) {
        if (n <= 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (map.get(n)==null){
            map.put(n,(fib(n-1) + fib(n-2))%1000000007);
        }
        return map.get(n);
    }

}
