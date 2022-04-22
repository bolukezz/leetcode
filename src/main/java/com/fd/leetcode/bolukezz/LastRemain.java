package main.java.com.fd.leetcode.bolukezz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuyumeng
 * @date 2022/4/22 10:06 上午
 */
public class LastRemain {
    public static void main(String[] args) {
        new LastRemain().lastRemaining(7, 2);
    }
    public int lastRemaining(int n, int m) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(i);
        }
        return recur(arr, m, 0);
    }

    public int recur(List<Integer> arr, int m, int begin) {
        if (arr.size() == 1) return arr.get(0);
        int tmp = (begin + m - 1) % arr.size();
        arr.remove(tmp);
        return recur(arr, m, tmp);
    }
}
