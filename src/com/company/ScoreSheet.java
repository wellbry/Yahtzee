package com.company;

public class ScoreSheet {
}




enum ScoreBox {
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

}