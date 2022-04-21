package com.fd.leetcode.hujih;

import java.util.HashSet;
import java.util.Set;

/**
 * @description:
 * @author: hjh
 * @date:2022-04-21 17:28
 **/
public class FourTwoOne {
    public boolean isStraight(int[] nums) {
        Set<Integer> repeat = new HashSet<>(8);
        int max = 0, min = 14;
        for(int num : nums) {
            if(num == 0) continue; // 跳过大小王
            max = Math.max(max, num); // 最大牌
            min = Math.min(min, num); // 最小牌
            if(repeat.contains(num)) return false; // 若有重复，提前返回 false
            repeat.add(num); // 添加此牌至 Set
        }
        return max - min < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }

}
