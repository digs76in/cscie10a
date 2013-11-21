/**
 * Reverses a string and prints it
 * @author Ryan Closner
 * @version 11/21/2012
 **/

import java.util.*;

public class ReverseTest
{
    public static void main (String[] args)
    {
        // Grab user input.

        Scanner in = new Scanner( System.in );
        System.out.print("Please enter a string: ");
        String str = in.nextLine();

        printReverse(str);
    }

    /**
     * Just prints the reversed string.
     * @param str string to print the inversion of
     **/

    private static void printReverse (String str)
    {
        // Print the reversed string
        System.out.println( reverse(str) );
    }

    /**
     * Reverses a string (e.g. "what" to "tahw").
     * @param str the string to reverse
     * @return    the reversed string
     **/

    // Note: Could be done more efficiently with a char array,
    // but I'm still not sure if we're able to use those.

    private static String reverse (String str)
    {
        // Return string if it's less than 1, else recursion (ftw).

        if (str.length() <= 1){
            return str;
        } else {
            return reverse( str.substring(1) ) + str.charAt(0);
        }
    }

}
