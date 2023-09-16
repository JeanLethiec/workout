package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 */
public class BuySellStock {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int max = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            }
            var profit = price - minPrice;
            if (profit > max) {
                max = profit;
            }
        }

        return max;
    }

    @Test
    void test() {
        assertEquals(5, maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    void test2() {
        assertEquals(0, maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    void test3() {
        assertEquals(1, maxProfit(new int[]{1,2}));
    }
}
