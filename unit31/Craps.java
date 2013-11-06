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
        Game game = new Game();
        game.play();
    }


    /**
     * A Craps Game
     **/

    private static class Game
    {
        // The established point;

        private int point = 0;

        // The dice

        private final Die dieOne = new Die();
        private final Die dieTwo = new Die();

        // A flag that reflects whether the game has ended.

        private boolean playing = true;

        /**
         * Plays the game
         **/
        void play () 
        {
            while(playing) {

                // Roll the dice

                int total = rollDice(); 

                // If bad number is rolled, end the game.

                if (isBadNumber(total)) {
                    lose();
                    continue;
                }

                // If good number is rolled, end the game or establish the new point.

                if (isGoodNumber(total)) {

                    // If winning number is rolled then end the game, else establish point.

                    if (isWinningNumber(total)) {
                        win();
                    } else {
                        establishPoint(total);
                    }
                }
            }
        }

        /**
         * Ends the game and prints losing message.
         **/

        private void lose ()
        {
            playing = false; 
            System.out.println("YOU LOSE!");
        }

        /**
         * Ends the game and prints winning message.
         **/

        private void win ()
        {
            playing = false; 
            System.out.println("YOU WIN!");
        }

        /**
         * Sets the current point to value
         * @param value the value to which the point should be set
         **/

        private void establishPoint (int value)
        {
            point = value;
            System.out.println( point + " is now the established point.");
        }

        /**
         * Determines whether the value is within set { 4, 5, 6, 8, 9, 10 }.
         * @param n the value to compare
         * @return  whether the value is a good number.
         **/

        private boolean isGoodNumber (int n)
        {
            return (n == 4 || n == 5 || n == 6 || n == 8 || n == 9 || n == 10);
        }

        /**
         * Determines whether the value is equal to 7.
         * @param n the value to compare
         * @return  whether the value is a bad number
         **/

        private boolean isBadNumber(int n)
        {
            return n == 7; 
        }

        /**
         * Determines whether the value is equal to the established point
         * @param n the value to compare
         * @return  whether the value is equal to the established point
         **/

        private boolean isWinningNumber(int n)
        {
            return n == point;
        }

        /**
         * Rolls the dice and calculates the total.
         * @return the sum of the two rolled dice values.
         **/

        private int rollDice ()
        {
            dieOne.roll(); 
            dieTwo.roll();

            int total = dieOne.value + dieTwo.value;

            System.out.println("Computer rolls a " + dieOne.value + " and a " + dieTwo.value + ", for a total of " + total);

            return total;
        }

    }

    /**
     * A Craps Die
     **/
    private static class Die
    {
        // The maximum allowed value

        private int MAX_VALUE = 6;

        // The initial value of the die.

        public int value = 0;

        /**
         * Sets the value to a random integer.
         **/
        void roll ()
        {
            value = randomInt(); 
        }

        /**
         * Generates a random integer within range of 1 to (MAX_VALUE).
         * @return a random integer between 1 and (MAX_VALUE).
         **/
        private int randomInt ()
        {
            Random generator = new Random(); 
            return generator.nextInt(MAX_VALUE - 1) + 1;
        }

    }

}
