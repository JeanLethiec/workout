package com.ceihtel.leetcode.medium;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/3sum/description/
 */
public class ThreeSum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    results.add(List.of(nums[i], nums[j], nums[k]));
                    j++;
                    while (j < k && nums[j] == nums[j-1]) {
                        j++;
                    }
                } else if (sum < 0) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return results;
    }

    @Test
    void test1() {
        assertEquals(List.of(List.of(-1, -1, 2), List.of(-1, 0, 1)), threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    void test2() {
        assertEquals(Collections.emptyList(), threeSum(new int[]{0, 1, 1}));
    }

    @Test
    void test3() {
        assertEquals(List.of(List.of(0, 0, 0)), threeSum(new int[]{0, 0, 0}));
    }

    @Test
    void test4() {
        assertEquals(List.of(List.of(0, 0, 0)), threeSum(new int[]{0, 0, 0, 0}));
    }
}
