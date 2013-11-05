/**
 * Prints (NUM) randomly-generated license plates
 * @author Ryan Closner
 * @version 11/5/2012
 **/

import java.util.*;

class License
{

    // The number of licenses to print.

    private static final int NUM = 20;

    // Prints (NUM) randomly generated license plates.

    public static void main (String [] args)
    {
        for (int i = 0; i < NUM; i++) {
            System.out.println( randomLicense() );
        }
    }

    /**
     * Randomly generates a (LENGTH) character license containing
     * (LENGTH / 2) digits followed by (LENGTH / 2) upper-case
     * letters (e.g. 471-IZO).
     * @returns a license of length (LENGTH)
     **/

    private static String randomLicense()
    {
        // Initialize the length of the license string.

        final int LENGTH = 6;

        // Initialize the license string.

        String license = "";

        // Append the license string with (LENGTH / 2) digits.

        for (int i = 0; i < LENGTH / 2; i++) {
            if (i == 0) {
                license += randomNonZeroNumber(); 
                continue;
            }
            license += randomNumber();
        }

        // Append the license string with a delimiter.

        license += '-';

        // Append the license string with 3 upper-case letters. 

        for (int i = 0; i < LENGTH / 2; i++) {
            license += randomLetter();
        }

        // Return the license string.

        return license;
    }

    /**
     * Generate a random upper-case letter.
     * @return a random upper-case letter.
     **/

    private static char randomLetter()
    {
        return randomChar(26,65);
    }

    /**
     * Generate a random non-zero digit.
     * @return a random non-zero digit.
     **/

    private static char randomNonZeroNumber()
    {
        return randomChar(9, 49);
    }

    /**
     * Generate a random digit.
     * @return a random digit.
     **/

    private static char randomNumber()
    {
        return randomChar(10, 48);
    }

    /**
     * Generate a random character from within a range.
     * @param range the length of the range.
     * @param start the start of the range.
     * @return      a random character within a range.
     **/

    private static char randomChar(int range, int start)
    {
        Random generator = new Random(); 
        int randomInt = generator.nextInt(range) + start;
        return (char)randomInt;
    }

}
