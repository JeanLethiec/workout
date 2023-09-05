package com.ceihtel.leetcode;

import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/linked-list-cycle/
 */
public class LinkedListCycle {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<>();

        while (head != null && head.next != null) {
            if (seen.contains(head)) {
                return true;
            } else {
                seen.add(head.next);
                head = head.next;
            }
        }

        return false;
    }

    @Test
    void test1() {
        var el1 = new ListNode(3);
        var el2 = new ListNode(2);
        el1.next = el2;
        var el3 = new ListNode(0);
        el2.next = el3;
        var el4 = new ListNode(-4);
        el4.next = el1;
        assertTrue(hasCycle(el1));
    }

    @Test
    void test2() {
        var el1 = new ListNode(1);
        var el2 = new ListNode(2);
        el1.next = el2;
        el2.next = el1;
        assertTrue(hasCycle(el1));
    }

    @Test
    void test3() {
        var el1 = new ListNode(1);
        assertFalse(hasCycle(el1));
    }

    @Test
    void test4() {
        assertFalse(hasCycle(null));
    }
}
