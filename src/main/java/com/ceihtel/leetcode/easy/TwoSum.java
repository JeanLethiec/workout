package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        var map = new HashMap<Integer, Integer>();

        for (var i = 0; i < nums.length; i++) {
            if (!map.containsKey(target - nums[i])) {
                map.put(nums[i], i);
            } else {
                return new int[]{map.get(target-nums[i]), i};
            }
        }

        throw new RuntimeException("No solution found");
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
