package com.company;

import static org.junit.jupiter.api.Assertions.*;

class YahtzeeEvaluatorTest {

    @org.junit.jupiter.api.Test
    void getRollSum() {
        int[] testInput = new int[5];
        for (int i = 0; i < 5; i++) {
            testInput[i] = 2;
        }
        int result = YahtzeeEvaluator.getRollSum(testInput);
        assertEquals(10, result);
        assertNotEquals(12,result);
    }

    @org.junit.jupiter.api.Test
    void isYatzy() {
        int[] testInput = {1,2,3,4,5};
        boolean result = YahtzeeEvaluator.isYatzy(testInput);
        assertFalse(result);
        int[] testInput2 = {2,2,2,2,2};
        assertTrue(YahtzeeEvaluator.isYatzy(testInput2));
    }

    @org.junit.jupiter.api.Test
    void isBigStraight() {
        int[] testInput = new int[5];
        for (int i = 0; i < 5; i++) {
            testInput[i] = i + 2;
        }
        boolean result = YahtzeeEvaluator.isBigStraight(testInput);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void isSmallStraight() {
        int[] testInput = new int[5];
        for (int i = 0; i < 5; i++) {
            testInput[i] = i + 1;
        }
        boolean result = YahtzeeEvaluator.isSmallStraight(testInput);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void isFullHouse() {
        assertTrue(YahtzeeEvaluator.isFullHouse());
    }

    @org.junit.jupiter.api.Test
    void isFourOfAKind() {
        assertTrue(YahtzeeEvaluator.isFourOfAKind());
    }
}