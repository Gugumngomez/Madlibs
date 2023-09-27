package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputText = new Scanner(System.in);

        System.out.println("Adjective (vivid and descriptive): ");
        String description = getInput(inputText);
        System.out.println("Who's sleepover did you go to: ");
        String whosSleepover = getInput(inputText);
        System.out.println("Number of people at the party: ");
        String people = getInput(inputText);
        System.out.println("Adjective (exciting): ");
        String description2 = getInput(inputText);
        System.out.println("Name of a popular board game: ");
        String game = getInput(inputText);
        System.out.println("Favorite snack name: ");
        String snack = getInput(inputText);
        System.out.println("Favorite movie genre (action, comedy, horror, etc.): ");
        String movieGenre = getInput(inputText);
        System.out.println("Adjective (unexpected): ");
        String description3 = getInput(inputText);
        System.out.println("Emotion (e.g., excited, nostalgic, surprised): ");
        String feeling = getInput(inputText);

        System.out.println("\nIt was a " + description + ", hot night in November." +
                " I went to a sleepover at my " +whosSleepover+"'s house... \n" +
                "where the the fun begun. There were " + people + " partygoers \n" +
                "at the sleepover, and it felt " + description2 + ".\n" +
                "We decided to break out the " + game + " board game, which sparked excitement among us. " +
                "\nBut a few were playfully complaining." +
                "\nWe then indulged in " + snack + " \nand enjoyed a/an " + movieGenre + " movie marathon" +
                ". As the night progressed, \nthings took an/a " + description3 + " turn, \nand everyone was feeling so " + feeling + ". We laughed" +
                " and shared stories until the early morning hours. \nIt was a night to remember. Good night!");
    }

    private static String getInput(Scanner scanner) {
        String input = "";
        while (input.isEmpty()) {
            input = scanner.nextLine().trim();
            if (input.isEmpty()) {
                System.out.println("Please enter input.");
            }
        }
        return input;
    }
}