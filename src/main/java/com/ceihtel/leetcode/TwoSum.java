package com.ceihtel.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            // System.out.println("Considering first number: " + i);
            for (int j = i + 1; j < nums.length; j++) {
                // System.out.println("Considering second number: " + j);
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalStateException();
    }

    @Test
    public void test1() {
        var result = twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void test2() {
        var result = twoSum(new int[]{3, 2, 4}, 6);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void test3() {
        var result = twoSum(new int[]{3, 3}, 6);
        assertEquals(0, result[0]);
        assertEquals(1, result[1]);
    }
}
