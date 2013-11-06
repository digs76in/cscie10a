/**
 * A reverse guessing game
 * @author Ryan Closner
 * @version 11/5/2012
 **/

import java.util.*;

class Guess
{

    // Initialize the upper and lower bounds for the guessing game.

    private static final int MIN = 0;
    private static final int MAX = 100;

    public static void main (String[] args)
    {

        Scanner in = new Scanner( System.in );
        String answer;
        char letter;

        int guesses = 0;
        int guess = 0;
        boolean guessing = true;

        int min = MIN;
        int max = MAX;

        // Print the instructions.

        System.out.println("This program has you, the user, choose a number between");
        System.out.println(MIN + " and " + MAX + ". Then I, the computer, will try my best to");
        System.out.println("guess it.\n");

        System.out.println("If I guess a number that’s SMALLER than the");
        System.out.println("secret number, respond by typing the letter 's'. If I");
        System.out.println("guess a number that’s BIGGER than the secret number,");
        System.out.println("respond by typing the letter 'b'. And if I guess");
        System.out.println("CORRECTLY, respond by typing the letter 'c'.\n");

        // Keep guessing until the correct answer has been guessed.

        while (guessing) {

            // Set the value of the guess.

            guess = (max - min) / 2 + min;

            // Increment the number of guesses

            guesses++;

            // Ask for guess feedback

            System.out.print("Is it " + guess + "? (type s, b, or c): ");
            answer = in.nextLine();
            letter = answer.charAt(0);

            // Digest response

            if (letter == 's') {
                max = guess;
            } else if (letter == 'b') {
                min = guess;
            } else if (letter == 'c') {
                guessing = false;
                System.out.println("I got it after making just " + guesses + " guesses");
            } else {
                System.out.println("Invalid answer.");
            }
        }
    }

}
