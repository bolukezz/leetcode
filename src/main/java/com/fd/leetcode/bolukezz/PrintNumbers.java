package main.java.com.fd.leetcode.bolukezz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuyumeng
 * @date 2022/3/27 5:51 下午
 */
public class PrintNumbers {
    public int[] printNumbers(int n) {
        int maxNum = (int) Math.pow(10, n);
        List<Integer> res = new ArrayList<>();
        for (int i = 1; i < maxNum; i++) {
            res.add(i);
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
        //todo 如果大数超出范围怎么办？转成String计算，递归求某个位的所有可能性，太麻烦不写了。
    }
}
