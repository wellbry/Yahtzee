package com.company;

public class Player {

    private Roll roll;
    private ScoreSheet scoreSheet;

    public Player(){
        roll = new Roll();
    }

    public Roll getRoll() {
        return roll;
    }
}
