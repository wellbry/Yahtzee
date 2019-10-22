package com.company;

public class Main {

    public static void main(String[] args) {

        YahtzeeProgram yahtzee = new YahtzeeProgram();
        yahtzee.play();

//        Player p1 = new Player("Magnus");
//        yahtzee.rollMenu(p1);

        /*
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
        */
    }
}
