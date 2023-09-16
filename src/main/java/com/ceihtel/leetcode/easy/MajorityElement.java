package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/majority-element/description/
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {
        Map<Integer, Integer> counts = new HashMap<>();

        for (int num : nums) {
            Integer count = counts.getOrDefault(num, 0);
            count++;
            if (count > nums.length / 2) {
                return num;
            } else {
                counts.put(num, count);
            }
        }

        return -1;
    }

    @Test
    void test1() {
        assertEquals(3, majorityElement(new int[]{3, 2, 3}));
    }

    @Test
    void test2() {
        assertEquals(2, majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}
