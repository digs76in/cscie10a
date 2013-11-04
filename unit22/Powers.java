/**
 * Prints the powers of 2 to a given number
 * @author Ryan Closner
 * @version 10/18/2012
 **/

import java.util.*;

class Powers
{
    public static void main (String[] args)
    {
        // Request the power to which we should print

        Scanner in = new Scanner( System.in );
        System.out.print("What power should we print to: ");

        // Assign the power to a variable

        int power = in.nextInt();

        // Throw error if power is negative. Otherwise, print the powers.

        if (power >= 0) {
            printPowersOf2(power);
        } else {
            throw new IllegalArgumentException("negative powers are not supported.");
        }
    }

    /**
     * Prints powers from (power) to zero.
     * @param power the power to which we should print
     **/

    static void printPowersOf2 (int power)
    {
        // In increasing order print the power of 2

        for (int i = 0; i <= power; i++) {
            System.out.print( pow(2, i));
            System.out.print(' ');
        }

        // Print new line

        System.out.println();
    }

    /**
     * @param num   the number to retreive the power of
     * @param power the power to which we should multiply
     * @return      the value of (num)^(power)
     **/
    static int pow (int num, int power)
    {
        // If power is 0 value is always 1.

        if (power == 0) return 1;

        // Cache temporary result

        int result = num;

        // For 1 to (power) multiple result by (num)

        for (int i = 1; i < power; i++) {
            result = result * num; 
        }

        // Return (num) ^ (power).

        return result;
    }

}
