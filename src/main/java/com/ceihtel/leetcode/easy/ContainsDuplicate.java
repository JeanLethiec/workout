package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int t : nums) {
            if (set.contains(t)) {
                return true;
            }
            set.add(t);
        }

        return false;
    }

    @Test
    void test1() {
        assertTrue(containsDuplicate(new int[]{1, 2, 3, 1}));
    }

    @Test
    void test2() {
        assertFalse(containsDuplicate(new int[]{1, 2, 3, 4}));
    }

    @Test
    void test3() {
        assertTrue(containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));
    }
}
