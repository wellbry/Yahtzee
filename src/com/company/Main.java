package com.company;

public class Main {

    public static void main(String[] args) {
        Roll roll = new Roll();
        roll.rollDice();

        for (int dice: roll.getRollArray()){
            System.out.println(dice);
        }

        System.out.println(YahtzeeEvaluator.getRollSum(roll.getRollArray()));

        int[] testInput = new int[5];
        for (int i = 0; i < 5; i++) {
            testInput[i] = i + 1;
        }

        for (int dice : testInput){
            System.out.println(dice);
        }
        if (YahtzeeEvaluator.isSmallStraight(testInput)){
            System.out.println("Small straight");
        }


	// write your code here
    }
}
