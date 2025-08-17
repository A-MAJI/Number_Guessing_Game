import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        final int MAX_NUMBER = 100;
        Scanner reader = new Scanner(System.in);
        String play;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            Random rand = new Random();
            int randNum = rand.nextInt(MAX_NUMBER + 1); // 0 to 100 inclusive
            int guess = -1;
            int tries = 0;

            System.out.println("\nI've picked a number between 0 and " + MAX_NUMBER + ". Try to guess it!");

            while (guess != randNum) {
                System.out.print("Your guess: ");
                if (reader.hasNextInt()) {
                    guess = reader.nextInt();
                    if (guess < 0 || guess > MAX_NUMBER) {
                        System.out.println("Please enter a number between 0 and " + MAX_NUMBER + ".");
                        continue;
                    }
                    tries++;
                    if (guess < randNum) {
                        System.out.println("Too low! Try again.");
                    } else if (guess > randNum) {
                        System.out.println("Too high! Try again.");
                    }
                } else {
                    System.out.println("Invalid input. Please enter a number.");
                    reader.next(); // clear invalid input
                }
            }

            System.out.println("🎉 Congratulations! You guessed the number in " + tries + " tries.");

            System.out.print("Do you want to play again? (yes/no): ");
            play = reader.next();

            while (!play.equalsIgnoreCase("yes") && !play.equalsIgnoreCase("no")) {
                System.out.print("Invalid input. Please enter 'yes' or 'no': ");
                play = reader.next();
            }

        } while (play.equalsIgnoreCase("yes"));

        System.out.println("Thanks for playing! Goodbye 👋");
        reader.close();
    }
}