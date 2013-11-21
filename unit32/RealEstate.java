/**
 * Prints a string with vowels removed
 * @author Ryan Closner
 * @version 11/21/2012
 **/

import java.util.*;

public class RealEstate
{
    public static void main (String[] args)
    {
        // Get user input

        Scanner in = new Scanner( System.in );
        System.out.print("Please enter a real estate ad: ");
        String ad = in.nextLine();

        // Print the ad without vowels.

        printAd(ad);
    }

    /**
     * Prints an ad without its vowels
     * @param ad   the advertisement to print
     **/

    private static void printAd (String ad)
    {
        System.out.print( removeVowels(ad) );
    }

    /**
     * Removes vowels from a string (unless it's the first letter of a word)
     * @param str the string to modify.
     * @return    the string without vowels. 
     **/

    private static String removeVowels (String str)
    {
        // Instantiate variables.

        String tmp = "";
        char c1 = ' ';
        char c2 = ' ';

        // Iterate over each char within the string

        for (int i = 0; i < str.length(); i++)
        {
            c2 = c1;
            c1 = str.charAt(i);

            // If it's a vowel, skip it (unless it's the beginning of a word)

            if (!(c2 == ' ' && c1 != ' ') && (c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u')) continue;

            // Append the string with the char

            tmp += c1;
        }

        // Return the vowel-less string

        return tmp;
    }
}
