package com.ceihtel.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }

    @Test
    void test1() {
        int[] nums = {3, 2, 2, 3};
        assertEquals(2, removeElement(nums, 3));
        assertEquals(2, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    void test2() {
        int[] nums = {0,1,2,2,3,0,4,2};
        assertEquals(5, removeElement(nums, 2));
        var firstNums = Arrays.copyOfRange(nums, 0, 5);
        Arrays.sort(firstNums);
        assertEquals(0, firstNums[0]);
        assertEquals(0, firstNums[1]);
        assertEquals(1, firstNums[2]);
        assertEquals(3, firstNums[3]);
        assertEquals(4, firstNums[4]);
    }
}
