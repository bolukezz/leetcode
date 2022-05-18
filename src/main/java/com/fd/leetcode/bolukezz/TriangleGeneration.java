package main.java.com.fd.leetcode.bolukezz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuyumeng
 * @date 2022/5/18 23:27
 */
public class TriangleGeneration {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> subRes = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                List<Integer> previous=null;
                if (i != 0) {
                    previous = res.get(i - 1);
                }
                int value = j == 0 || j == i ? 1 : previous.get(j - 1) + previous.get(j);
                subRes.add(value);
            }
            res.add(subRes);
        }
        return res;
    }
}
