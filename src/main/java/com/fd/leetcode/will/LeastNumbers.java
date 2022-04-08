package com.fd.leetcode.will;

import java.util.Comparator;
import java.util.PriorityQueue;

/**
 * @author will
 * @date 2022-04-08 23:06
 */
public class LeastNumbers {
    public int[] getArrayTopK(int[] array, int k) {
        int[] res = new int[4];
        if (k <= 0) return res;

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < k; i++) {
            queue.offer(array[i]);
        }

        for (int i = k; i < array.length; i++) {
            if (array[i] < queue.peek()) {
                queue.poll();
                queue.add(array[i]);
            }
        }

        for (int i = queue.size() - 1; i >= 0; i--) {
            res[i] = queue.poll();
        }

        return res;
    }
}
