package com.company;

import java.util.ArrayList;

public class YahtzeeProgram {
    private ArrayList<Player> players = new ArrayList<>();
    private Roll roller = new Roll();
    View view = View.getInstance();

    public void play(){
        players.add(new Player("Magnus"));
        //view.displayPlayerScores(players.get(0));



        for (int i = 0; i < ScoreBox.values().length; i++){ //TODO one too many? should be right
            for (Player player:players) {
                roller.rollDice();
                System.out.println(roller.toString());
                rollMenu(player);
            }
        }
        for (Player player:players) {
            view.displayPlayerScores(player);
        }
    }

    public void rollMenu(Player player){
        ScoreBox menuChoice = null;
        boolean validChoice = false;
        while (!validChoice){
            menuChoice = view.showMenuAndGetChoice(ScoreBox.values(), player);
            switch (menuChoice){
                case ONES:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.containsDice(roller.getRollArray(), 1)) {
                            int score = YahtzeeEvaluator.sumOfDice(roller.getRollArray(), 1);
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case TWOS:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.containsDice(roller.getRollArray(), 2)) {
                            int score = YahtzeeEvaluator.sumOfDice(roller.getRollArray(), 2);
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case THREES:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.containsDice(roller.getRollArray(), 3)) {
                            int score = YahtzeeEvaluator.sumOfDice(roller.getRollArray(), 3);
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case FOURS:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.containsDice(roller.getRollArray(), 4)) {
                            int score = YahtzeeEvaluator.sumOfDice(roller.getRollArray(), 4);
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case FIVES:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.containsDice(roller.getRollArray(), 5)) {
                            int score = YahtzeeEvaluator.sumOfDice(roller.getRollArray(), 5);
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case SIXES:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.containsDice(roller.getRollArray(), 6)) {
                            int score = YahtzeeEvaluator.sumOfDice(roller.getRollArray(), 6);
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case THREE_OF_A_KIND:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.isThreeOfAKind(roller.getRollArray())) {
                            int score = YahtzeeEvaluator.getRollSum(roller.getRollArray());
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case FOUR_OF_A_KIND:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.isFourOfAKind(roller.getRollArray())) {
                            int score = YahtzeeEvaluator.getRollSum(roller.getRollArray());
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.addToTotalScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case FULL_HOUSE:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.isFullHouse(roller.getRollArray())) {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(25);
                            player.addToTotalScore(25);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case SMALL_STRAIGHT:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.isSmallStraight(roller.getRollArray())) {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(30);
                            player.addToTotalScore(30);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case LARGE_STRAIGHT:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.isBigStraight(roller.getRollArray())) {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(40);
                            player.addToTotalScore(40);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case YAHTZEE:
                    if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()){
                        if (YahtzeeEvaluator.isYahtzee(roller.getRollArray())) {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(50);
                            player.addToTotalScore(50);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        } else {
                            player.getScores().get(menuChoice.ordinal()).setRollScore(0);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                        }
                        validChoice = true;
                    } else {
                        view.printErrorMessage("You have already chosen this option, try again");
                    }
                    break;
                case CHANCE:
                        if (!player.getScores().get(menuChoice.ordinal()).isHasBeenUsed()) {
                            int score = YahtzeeEvaluator.getRollSum(roller.getRollArray());
                            player.getScores().get(menuChoice.ordinal()).setRollScore(score);
                            player.getScores().get(menuChoice.ordinal()).setHasBeenUsed(true);
                            player.addToTotalScore(score);
                            validChoice = true;
                        } else {
                            view.printErrorMessage("You have already chosen this option, try again");
                        }
                    break;
                default:
                    view.printErrorMessage("Not a valid choice");
                    break;
            }
        }
    }


}
