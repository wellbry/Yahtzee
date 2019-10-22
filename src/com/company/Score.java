package com.company;

public class Score {
    private int rollScore;
    private ScoreBox scoreBox;
    private boolean hasBeenUsed;

    public Score(int rollScore, ScoreBox scoreBox){
        this.rollScore = rollScore;
        this.scoreBox = scoreBox;
        hasBeenUsed = false;
    }

    public void setRollScore(int rollScore) {
        this.rollScore = rollScore;
    }

    public void setHasBeenUsed(boolean hasBeenUsed) {
        this.hasBeenUsed = hasBeenUsed;
    }

    public boolean isHasBeenUsed() {
        return hasBeenUsed;
    }

    public String toString(){
        return String.format("%15s %5d", scoreBox.getDisplayString(), rollScore);
    }
}

enum ScoreBox implements HasDisplayString{
    ONES("Ones"),
    TWOS("Twos"),
    THREES("Threes"),
    FOURS("Fours"),
    FIVES("Fives"),
    SIXES("Sixes"),
    THREE_OF_A_KIND("Three of a kind"),
    FOUR_OF_A_KIND("Four of a kind"),
    FULL_HOUSE("Full House"),
    SMALL_STRAIGHT("Small Straight"),
    LARGE_STRAIGHT("Large Straight"),
    YAHTZEE("Yahtzee"),
    CHANCE("Chance");


    private String displayString;
    private ScoreBox(String displayString){
        this.displayString = displayString;
    }

    public String getDisplayString(){
        return displayString;
    }
}