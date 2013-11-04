/**
 * Finds a number of length (LENGTH) that when multiplied by a number (MULT_CONST)
 * then reversed is equal to the original number.
 * @author Ryan Closner
 * @version 10/18/2012
 **/

import java.util.*;

class Digits
{

    // The multiplicative constant.

    private static final int MULT_CONST = 4;

    // The minimum length of the integer.

    private static final int LENGTH = 5;

    static public void main(String[] args)
    {
        // Instantiate the match variable.

        int match = 0;

        // Get the lowest possible number of length (LENGTH)

        int num = (int)Math.pow(10, (LENGTH - 1));

        // Test each number greater than number (num) to see if a match
        // occurs.

        while (match == 0) {
            if (reverseNum( num * MULT_CONST ) == num) {
                match = num;
            } else {
                num++; 
            }
        }

        // Print the match

        System.out.println(match);
    }

    /**
    * Reverses an integer (e.g. 1234 to 4321)
    * @param  num the number to be reversed
    * @return     the reversed number
    **/

    static int reverseNum (int num)
    {
        int rev = 0; 

        // Grab each digit and add it to rev

        while (num != 0)
        {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        return rev;
    }

}
