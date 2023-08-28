package com.ceihtel.leetcode;

import org.junit.jupiter.api.Test;

import java.util.Map;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        Map<Character, Character> matching = Map.of('{', '}', '(', ')', '[', ']');
        Map<Character, Character> reverseMatching = Map.of('}', '{', ')', '(', ']', '[');

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if (matching.containsKey(current)) {
                stack.push(current);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == reverseMatching.get(current)) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    @Test
    void test1() {
        assertTrue(isValid("()"));
    }

    @Test
    void test11() {
        assertTrue(isValid("[]"));
    }

    @Test
    void test12() {
        assertTrue(isValid("([{[]}])"));
    }

    @Test
    void test2() {
        assertTrue(isValid("()[]{}"));
    }

    @Test
    void test3() {
        assertFalse(isValid("(]"));
    }

    @Test
    void test33() {
        assertFalse(isValid("(({}])"));
    }

    @Test
    void test34() {
        assertFalse(isValid("(({[}])"));
    }
}
