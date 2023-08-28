package com.ceihtel.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        var builder = new StringBuilder();
        String processed = s.toLowerCase()
                .replaceAll("[^a-zA-Z\\d]", "");
        builder.append(processed);
        builder.reverse();
        return builder.toString().equals(processed);
    }

    @Test
    void test() {
        assertTrue(isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    void test2() {
        assertFalse(isPalindrome("race a car"));
    }

    @Test
    void test3() {
        assertTrue(isPalindrome(" "));
    }

    @Test
    void test4() {
        assertTrue(isPalindrome("ab_a"));
    }
}
