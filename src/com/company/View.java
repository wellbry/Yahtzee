package com.company;

import java.util.Scanner;

public class View {
    private static View instance = null;

    private View(){}

    public static View getInstance() {
        if (instance == null){
            instance = new View();
        }
        return instance;
    }

    public <T extends HasDisplayString> T showMenuAndGetChoice(T[] menuItems, Player player) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Make a choice.");
        for (int i = 0; i < menuItems.length; i++) {
            System.out.printf("%2d %s\n", (i + 1), player.getScores().get(i).toString());
        }
        int menuChoice = -1;
        do {
            try {
                menuChoice = Integer.parseInt(scanner.nextLine());
                return menuItems[menuChoice - 1];
            } catch (Exception e) {
                printErrorMessage("Invalid choice, try again.");
            }
        } while (menuChoice != (menuItems.length - 1));
        return null;
    }

    public void printErrorMessage(String errorMessage){
        System.out.println("Error: " + errorMessage);
    }

    public void displayPlayerScores(Player player){
        System.out.printf("%15s\n", player.getName());
        for(Score score: player.getScores()){
            System.out.println(score.toString());
        }
        System.out.printf("%15s %5d\n\n", "Total", player.getTotalScore());
    }

    public void printString(String string){
        System.out.println(string);
    }

    public String readString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
