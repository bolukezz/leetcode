package main.java.com.fd.leetcode.yanL;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExchangeNum {

    public static void main(String[] args) {

    }

    public static int[] solution(int[] nums) {
        List<Integer> a1 = new ArrayList<>();
        List<Integer> a2 = new ArrayList<>();
        Arrays.stream(nums).forEach(
                value -> {
                    if (value % 2 != 0) {
                        a1.add(value);
                    } else {
                        a2.add(value);
                    }
                }
        );
        int[] res = new int[nums.length];
        for (int i = 0; i < a1.size(); i++) {
            res[i] = a1.get(i);
        }
        for (int i = 0; i < a2.size(); i++) {
            res[i + a1.size()] = a2.get(i);
        }
        return res;
    }
}
