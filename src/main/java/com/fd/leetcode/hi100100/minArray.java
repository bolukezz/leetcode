package com.fd.leetcode.hi100100;

/**
 * @author Administrator
 * @data 2022/3/25  15:02
 */
public class minArray {
    public static void main(String[] args) {

    }
    public int minArray(int[] numbers) {
        for (int i = numbers.length-1; i >0 ; i--) {
            if (numbers[i]<numbers[i-1]){
                return numbers[i];
            }
        }
        return numbers[0];
    }
}
