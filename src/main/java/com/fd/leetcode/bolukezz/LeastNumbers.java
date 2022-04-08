package main.java.com.fd.leetcode.bolukezz;

import java.util.PriorityQueue;

/**
 * @author zhuyumeng
 * @date 2022/4/8 10:11 上午
 */
public class LeastNumbers {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (arr == null || arr.length == 0) {
            return new int[] {};
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p2 - p1);
        for (int i : arr) {
            pq.add(i);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] res = new int[k];
        int idx = 0;
        while (!pq.isEmpty()) {
            res[idx++] = pq.poll();
        }
        return res;
    }
}
