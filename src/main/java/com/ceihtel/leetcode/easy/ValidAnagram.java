package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/valid-anagram/
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> count = new HashMap<>();

        for (char c : s.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            count.put(c, count.getOrDefault(c, 0) - 1);
        }

        for (int val: count.values()) {
            if (val != 0) {
                return false;
            }
        }

        return true;
    }

    /**
     * Works, but higher complexity means slower for bigger strings
     */
    public boolean isAnagramWithSort(String s, String t) {
        byte[] bytes1 = s.getBytes();
        byte[] bytes2 = t.getBytes();
        Arrays.sort(bytes1);
        Arrays.sort(bytes2);
        return Arrays.equals(bytes1, bytes2);
    }

    @Test
    void test1() {
        assertTrue(isAnagram("anagram", "nagaram"));
    }

    @Test
    void test2() {
        assertFalse(isAnagram("rat", "car"));
    }
}
