package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/longest-common-prefix
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        if (strs.length == 0) {
            return prefix.toString();
        }

        Arrays.sort(strs);
        var first = strs[0];
        var last = strs[strs.length-1];

        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return prefix.toString();
            } else {
                prefix.append(first.charAt(i));
            }
        }

        return prefix.toString();
    }

    /**
     * Without the trick of sorting the input array
     */
    public String longestCommonPrefixComparingAll(String[] strs) {
        StringBuilder prefix = new StringBuilder();

        var shortest = Arrays.stream(strs)
                .min(Comparator.comparing(String::length));

        if (shortest.isEmpty()) {
            return prefix.toString();
        }

        for (int i = 0; i < shortest.get().length(); i++) {
            if (strs[0].isBlank())
                return prefix.toString();

            char buffer = strs[0].charAt(i);
            for (int j = 1; j < strs.length; j++) {
                if (strs[j].charAt(i) != buffer) {
                    return prefix.toString();
                }
            }
            prefix.append(buffer);
        }

        return prefix.toString();
    }

    @Test
    void test1() {
        assertEquals("fl", longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    @Test
    void test2() {
        assertEquals("", longestCommonPrefix(new String[]{"dog", "racecar", "car"}));
    }

    @Test
    void test3() {
        assertEquals("a", longestCommonPrefix(new String[]{"a"}));
    }

    @Test
    void test4() {
        assertEquals("", longestCommonPrefix(new String[]{""}));
    }

    @Test
    void test5() {
        assertEquals("a", longestCommonPrefix(new String[]{"ab", "a"}));
    }
}
