package com.company;

import java.util.ArrayList;

public class Player {
    private String name;
    private ArrayList<Score> scores;
    private int totalScore;

    public Player(String name){
        this.name = name;
        totalScore = 0;

        scores = new ArrayList<>();
        for (int i = 0; i < ScoreBox.values().length; i++){
            scores.add(new Score(-1, ScoreBox.values()[i]));
        }
    }

    public ArrayList<Score> getScores() {
        return scores;
    }

    public void addToTotalScore(int score){
        totalScore += score;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public String getName() {
        return name;
    }
}
