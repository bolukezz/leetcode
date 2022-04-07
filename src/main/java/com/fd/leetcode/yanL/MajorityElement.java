package main.java.com.fd.leetcode.yanL;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    public static void main(String[] args) {
        MajorityElement.solution(new int[]{1,2,2,2,2,4});
    }

    public static int solution(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer v : nums) {
            if (map.containsKey(v)) {
                map.put(v, map.get(v) + 1);
            } else {
                map.put(v, 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() >= nums.length/2) return entry.getKey();
        }
        return -1;
    }

}
