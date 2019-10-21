package com.company;

public class YahtzeeEvaluator {


    public static int getRollSum(int[] roll) {
        int sum = 0;
        for (int diceRoll : roll) {
            sum += diceRoll;
        }
        return sum;
    }

    public static boolean isYatzy(int[] roll) {
        int sameCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (roll[i] == roll[i + 1]) {
                sameCounter++;
            }
        }
        if (sameCounter == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isBigStraight(int[] roll) {
        int straightCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (roll[i] == (roll[i + 1] - 1)) {
                straightCounter++;
            }
        }
        if ((roll[0] == 2) && straightCounter == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSmallStraight(int[] roll) {
        int straightCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (roll[i] == (roll[i + 1] - 1)) {
                straightCounter++;
            }
        }
        if ((roll[0] == 1) && straightCounter == 4) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFullHouse() {
        return false;
    }

    public static boolean isFourOfAKind() {
        return false;
    }
}
