package com.ceihtel.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/merge-sorted-array/
 */
public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        var i = m - 1;
        var j = n - 1;
        var k = m + n - 1;

        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
    }

    @Test
    void test1() {
        int[] array = {1, 2, 3, 0, 0, 0};
        merge(array, 3, new int[]{2, 5, 6}, 3);
        assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, array);
    }

    @Test
    void test2() {
        int[] array = {1};
        merge(array, 1, new int[]{}, 0);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    void test3() {
        int[] array = {0};
        merge(array, 0, new int[]{1}, 1);
        assertArrayEquals(new int[]{1}, array);
    }

    @Test
    void test4() {
        int[] array = {4, 5, 6, 0, 0, 0};
        merge(array, 3, new int[]{1, 2, 3}, 3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array);
    }

    @Test
    void test5() {
        int[] array = {0, 0, 0, 0, 0};
        merge(array, 0, new int[]{1, 2, 3, 4, 5}, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
    }

    @Test
    void test6() {
        int[] array = {4, 0, 0, 0, 0, 0};
        merge(array, 1, new int[]{1, 2, 3, 5, 6}, 5);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, array);
    }

    @Test
    void test7() {
        int[] array = {-1, 0, 0, 3, 3, 3, 0, 0, 0};
        merge(array, 6, new int[]{1, 2, 2}, 3);
        assertArrayEquals(new int[]{-1, 0, 0, 1, 2, 2, 3, 3, 3}, array);
    }
}
