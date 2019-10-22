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
        assertNotEquals(12, result);
    }

    @org.junit.jupiter.api.Test
    void containsDice() {
        int[] testInput = {1, 2, 2, 2, 2};
        assertTrue(YahtzeeEvaluator.containsDice(testInput, 1));
        assertFalse(YahtzeeEvaluator.containsDice(testInput, 3));
    }

    @org.junit.jupiter.api.Test
    void isYatzy() {
        int[] testInput = {1, 2, 3, 4, 5};
        assertFalse(YahtzeeEvaluator.isYatzy(testInput));
        int[] testInput2 = {2, 2, 2, 2, 2};
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
        int[] testInput = {1, 2, 3, 4, 5};
        int[] testInput2 = {1, 2, 3, 4, 6};
        int[] testInput3 = {2, 3, 3, 4, 5};
        int[] testInput4 = {2, 2, 3, 4, 5};
        int[] testInput5 = {1, 3, 4, 5, 6};
        int[] testInput6 = {1, 2, 3, 5, 6};


        assertTrue(YahtzeeEvaluator.isSmallStraight(testInput));
        assertTrue(YahtzeeEvaluator.isSmallStraight(testInput2));
        assertTrue(YahtzeeEvaluator.isSmallStraight(testInput3));
        assertTrue(YahtzeeEvaluator.isSmallStraight(testInput4));
        assertTrue(YahtzeeEvaluator.isSmallStraight(testInput5));
        assertFalse(YahtzeeEvaluator.isSmallStraight(testInput6));
    }

    @org.junit.jupiter.api.Test
    void isFullHouse() {
        int[] testInput = {1, 1, 1, 4, 4,};
        int[] testInput2 = {1, 1, 3, 4, 4,};
        int[] testInput3 = {1, 1, 3, 3, 3};
        assertTrue(YahtzeeEvaluator.isFullHouse(testInput));
        assertFalse(YahtzeeEvaluator.isFullHouse(testInput2));
        assertTrue(YahtzeeEvaluator.isFullHouse(testInput3));
    }

    @org.junit.jupiter.api.Test
    void isFourOfAKind() {
        int[] testInput = {1, 1, 1, 1, 4,};
        int[] testInput2 = {1, 4, 4, 4, 4,};
        int[] testInput3 = {1, 1, 3, 4, 4,};
        assertTrue(YahtzeeEvaluator.isFourOfAKind(testInput));
        assertTrue(YahtzeeEvaluator.isFourOfAKind(testInput2));
        assertFalse(YahtzeeEvaluator.isFourOfAKind(testInput3));
    }

    @org.junit.jupiter.api.Test
    void isThreeOfAKind() {
        int[] testInput = {1, 1, 1, 1, 4,};
        int[] testInput2 = {1, 3, 4, 4, 4,};
        int[] testInput3 = {1, 1, 3, 4, 4,};
        assertTrue(YahtzeeEvaluator.isThreeOfAKind(testInput));
        assertTrue(YahtzeeEvaluator.isThreeOfAKind(testInput2));
        assertFalse(YahtzeeEvaluator.isThreeOfAKind(testInput3));
    }
}