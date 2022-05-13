package main.java.com.fd.leetcode.bolukezz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhuyumeng
 * @date 2022/5/13 23:20
 */
public class Intersect {
    public static void main(String[] args) {
        new Intersect().intersect(new int[] {1, 2, 2, 1}, new int[] {2, 2});
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : nums1) {
            Integer value = map.get(i);
            if (value != null) {
                value++;
            } else {
                value = Integer.valueOf(1);
            }
            map.put(i, value);
        }
        List<Integer> res = new ArrayList<>();
        for (int i : nums2) {
            Integer value = map.get(i);
            if (value != null && value > 0) {
                res.add(i);
                value--;
                map.put(i, value);
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            ans[i] = res.get(i);
        }
        return ans;
    }
}
