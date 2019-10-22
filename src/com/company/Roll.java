package com.company;

import java.util.Random;

public class Roll {
    private int[] rollArray = new int[5];
    Random rand = new Random();

    public int[] rollDice(){
        for (int i = 0; i < 5; i++){
            rollArray[i] = rand.nextInt(6) + 1;
        }
        java.util.Arrays.sort(rollArray);
        return rollArray;
    }

    public int[] getRollArray() {
        java.util.Arrays.sort(rollArray);
        return rollArray;
    }

    @Override
    public String toString() {
        return String.format("Roll: %d, %d, %d, %d, %d", rollArray[0], rollArray[1], rollArray[2], rollArray[3], rollArray[4]);
    }
}
