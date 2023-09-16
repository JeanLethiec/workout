package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 */
public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    @Test
    void test1() {
        int[] nums = new int[] {1,1,2};
        assertEquals(2, removeDuplicates(nums));
        assertEquals(1, nums[0]);
        assertEquals(2, nums[1]);
    }

    @Test
    void test2() {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        assertEquals(5, removeDuplicates(nums));
        assertEquals(0, nums[0]);
        assertEquals(1, nums[1]);
        assertEquals(2, nums[2]);
        assertEquals(3, nums[3]);
        assertEquals(4, nums[4]);
    }
}
