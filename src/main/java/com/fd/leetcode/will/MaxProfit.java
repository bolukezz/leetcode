package com.fd.leetcode.will;

/**
 * @author will
 * @date 2022-05-17 22:30
 */
public class MaxProfit {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE, maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice){
                minPrice = price;
            }else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}
