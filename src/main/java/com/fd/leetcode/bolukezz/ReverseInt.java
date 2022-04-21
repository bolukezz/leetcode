package main.java.com.fd.leetcode.bolukezz;

import java.util.Deque;
import java.util.LinkedList;

/**
 * @author zhuyumeng
 * @date 2022/4/18 11:13 上午
 */
public class ReverseInt {
    public static void main(String[] args) {
        int reverse = new ReverseInt().reverse2(-2147483412);
    }

    public int reverse(int x) {
        if (x == 0) {
            return 0;
        }
        String str = String.valueOf(x);
        boolean flag = x < 0 ? true : false;
        int idx = 0;
        if (flag) {
            idx++;
        }
        Deque<Character> stack = new LinkedList<>();
        for (int i = idx; i < str.length(); i++) {
            char c = str.charAt(i);
            stack.push(c);
        }
        StringBuilder resStr = new StringBuilder(flag ? "-" : "");
        while (!stack.isEmpty()) {
            resStr.append(stack.poll());
        }
        String minValue = String.valueOf(Integer.MIN_VALUE);
        String maxValue = String.valueOf(Integer.MAX_VALUE);
        String res = resStr.toString();
        if (res.compareTo(minValue) == -1 || res.compareTo(maxValue) == 1) {
            return 0;
        }
        return Integer.valueOf(res);
    }


    public int reverse2(int x) {
        int res = 0;
        while (x != 0) {
            if (res > Integer.MAX_VALUE / 10 || res < Integer.MIN_VALUE / 10) {
                return 0;
            }
            int posVal = x % 10;
            res = res * 10 + posVal;
            x /= 10;
        }
        return res;
    }
}
