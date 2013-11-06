/**
 * Plays a game of craps
 * @author Ryan Closner
 * @version 11/5/2012
 **/

import java.util.*;

class Craps
{

    // Plays a game of craps

    public static void main (String[] args)
    {
        // Instantiate the variables.

        boolean playing = true;
        int value1 = 0;
        int value2 = 0;
        int total = 0;
        int point = 0;

        // Loop until the game is over.

        while(playing) {
            // Roll the dice

            value1 = randomInt();
            value2 = randomInt();
            total = value1 + value2;

            System.out.println("Computer rolls a " + value1 + " and a " + value2 + ", for a total of " + total);

            // End the game if a 7 is rolled.

            if ( isBadNumber(total) ) {
                playing = false;
                System.out.println("YOU LOSE!");
                continue;
            }

            // Establish the point or end the game.

            if ( isGoodNumber(total) ) {
                if (point == total) {
                    playing = false;
                    System.out.println("YOU WIN!");
                } else {
                    point = total; 
                    System.out.println( point + " is now the established point.");
                }
            }
        }
    }

    /**
     * Determines whether the value is within set { 4, 5, 6, 8, 9, 10 }.
     * @param n the value to compare
     * @return  whether the value is a good number.
     **/

    private static boolean isGoodNumber (int n)
    {
        return (n == 4 || n == 5 || n == 6 || n == 8 || n == 9 || n == 10);
    }

    /**
     * Determines whether the value is equal to 7.
     * @param n the value to compare
     * @return  whether the value is a bad number
     **/

    private static boolean isBadNumber(int n)
    {
        return n == 7; 
    }

    /**
     * Generates a random integer within range of 1 to 6.
     * @return a random integer.
     **/

    private static int randomInt ()
    {
        Random generator = new Random(); 
        return generator.nextInt(5) + 1;
    }

}
