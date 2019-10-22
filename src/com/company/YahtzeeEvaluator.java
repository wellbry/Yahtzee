package com.company;

public class YahtzeeEvaluator {

    public static int getRollSum(int[] roll) {
        int sum = 0;
        for (int diceRoll : roll) {
            sum += diceRoll;
        }
        return sum;
    }

    public static boolean containsDice(int[] roll, int whichDice) {
        for (int dice : roll) {
            if (dice == whichDice) {
                return true;
            }
        }
        return false;
    }

    public static int sumOfDice(int[] roll, int whichDice){
        int sum = 0;
        for (int dice : roll) {
            if (dice == whichDice) {
                sum +=dice;
            }
        }
        return sum;
    }

    public static boolean isYahtzee(int[] roll) {
        int sameCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (roll[0] == roll[i + 1]) {
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
        if (straightCounter == 4) {
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
        if (straightCounter >= 3 &&
                ((((roll[0] + 3) == roll[3]) || ((roll[0] + 3) == roll[4]))
                        || (((roll[0] + 3) == roll[4]) || ((roll[1] + 3) == roll[4])))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFullHouse(int[] roll) {
        int sameCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (roll[i] == roll[i + 1]) {
                sameCounter++;
            }
        }
        if (sameCounter == 3 && ((roll[1] != roll[2]) || (roll[2] != roll[3]))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isFourOfAKind(int[] roll) {
        int sameCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (roll[i] == roll[i + 1]) {
                sameCounter++;
            }
        }
        if (sameCounter == 3 && !((roll[1] != roll[2]) || (roll[2] != roll[3]))) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isThreeOfAKind(int[] roll) {
        if ((roll[0] == roll[1] && roll[1] == roll[2]) || (roll[1] == roll[2] && roll[2] == roll[3]) ||
                (roll[2] == roll[3] && roll[3] == roll[4])) {
            return true;
        } else {
            return false;
        }
    }
}
