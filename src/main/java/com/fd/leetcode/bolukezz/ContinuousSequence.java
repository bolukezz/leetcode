package main.java.com.fd.leetcode.bolukezz;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhuyumeng
 * @date 2022/4/18 10:04 上午
 */
public class ContinuousSequence {
    public int[][] findContinuousSequence(int target) {
        List<int[]> res = new ArrayList<>();
        int i = 0, j = 0, sum = 0;
        for (int k = 1; k < target; k++) {
            j = k;
            sum += j;
            while (sum >= target) {
                sum -= i;
                i++;
            }
            if (sum == target) {
                List<Integer> ans = new ArrayList<>();
                for (int l = i; l <= j; l++) {
                    ans.add(l);
                }
                res.add(ans.stream().mapToInt(Integer::intValue).toArray());
            }
        }
        return res.toArray(new int[res.size()][]);
    }
}
