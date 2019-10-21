package com.company;

public class YahtzeeEvaluator {

    public int getRollScore(Roll roll){
        //TODO player should choose
        if (isYatzy(roll.getRollArray())){
            return 50;
        } else if (isBigStraight(roll.getRollArray())){
            return 40;
        }else if (isSmallStraight(roll.getRollArray())){
            return 30;
        } else if (isFullHouse(roll.getRollArray())){
            return 25;
        }


        else {
            return getRollSum(roll.getRollArray());
        }


    }

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
        if ((roll[0] == 2) && straightCounter == 4) {
            return true;
        } else {
            return false;
        }
    }

    //TODO change to proper small straight
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

    public static boolean isFullHouse(int[] roll) {
        int sameCounter = 0;
        for (int i = 0; i < 4; i++) {
            if (roll[i] == roll[i + 1]) {
                sameCounter++;
            }
        }
        if (sameCounter == 3 && ((roll[1] != roll[2]) || (roll[2] != roll[3]))) {
            return true;
        }else {
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
        }else {
            return false;
        }
    }

    public static boolean isThreeOfAKind(int[] roll){
        if ((roll[0] == roll[1] && roll[1] == roll[2]) || (roll[1] == roll[2] && roll[2] == roll[3]) ||
                (roll[2] == roll[3] && roll[3] == roll[4])) {
            return true;
        } else {
            return false;
        }
    }
}
