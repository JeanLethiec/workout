package com.ceihtel.leetcode.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/furthest-point-from-origin/
 */
public class FurthestPointFromOrigin {
    public int furthestDistanceFromOrigin(String moves) {
        int nL = 0;
        int nR = 0;
        int nWildcard = 0;
        for (Character x : moves.toCharArray()) {
            if (x == 'L') {
                nL++;
            } else if (x == 'R') {
                nR++;
            } else {
                nWildcard++;
            }
        }

        return Math.abs(nL - nR) + nWildcard;
    }

    @Test
    void test1() {
        assertEquals(3, furthestDistanceFromOrigin("L_RL__R"));
    }

    @Test
    void test2() {
        assertEquals(5, furthestDistanceFromOrigin("_R__LL_"));
    }

    @Test
    void test3() {
        assertEquals(7, furthestDistanceFromOrigin("_______"));
    }
}
