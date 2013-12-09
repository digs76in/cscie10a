/**
 * Lists the digits repeated in integer
 * @author Ryan Closner
 * @version 12/3/2012
 **/

import java.util.*;

class RepeatedDigits
{

    public static void main (String[] args)
    {
        // Instantiate scanner

        Scanner in = new Scanner(System.in);

        // Grab the integer from the user

        System.out.print("Please enter an integer: ");
        int num = in.nextInt();
        num = (num < 0) ? (num * -1) : num;

        // Count occurrences in integer

        int[] occurrences = new int[10];
        for (int i = 0; i < 10; i++) {
            occurrences[i] = countOccurrences(i, num);
        }

        // Print Digits

        String digitString = "Digit:       ";
        for (int i = 0; i < occurrences.length; i++) {
            digitString += " " + i + " ";
        }

        System.out.println(digitString);

        // Print Occurrences

        String occurrencesString = "Occurrences: ";
        for (int i = 0; i < occurrences.length; i++) {
            occurrencesString += " " + occurrences[i] + " ";
        }

        System.out.println(occurrencesString);
    }

    /**
     * Counts digit occurrences within number
     * @param digit the digit to look for
     * @param num   the number to parse
     * @return      the number of occurrences
     **/

    private static int countOccurrences (int digit, int num)
    {
        // Instantiate count

        int count = 0;
        
        // Iterate over every digit within int

        while (num > 0) {
            if (num % 10 == digit) count++;
            num /= 10;
        }

        // Return count

        return count;
    }

}
