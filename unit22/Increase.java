/**
 * Prints the greatest increase in a stock's price for a range of (DAYS).
 * @author Ryan Closner
 * @version 10/18/2012
 **/

import java.util.*;

class Increase
{
    // Determines the length of the range for which the commparison will take place.

    private static final int DAYS = 10;

    public static void main (String[] args)
    {
        // Ask for the user to input (DAYS) days of stock pricing.

        Scanner in = new Scanner( System.in );
        System.out.print("Please enter the price of a stack over a "+ DAYS + "-day period: ");

        // Instantiate relevant variables

        int a = 0;
        int b = 0;
        int index = 0;
        int max = 0;
        int diff = 0;
        int v1 = 0;
        int v2 = 0;

        // Collect and compare stock prices over (DAYS) days

        for (int i = 0; i < DAYS; i++) {

            // Nothing to compare on the first day, move along...

            if (i == 0) {
                a = in.nextInt(); 
                continue;
            }

            // Collect the input for day (i).

            b = in.nextInt();

            // Get the difference between day (i - 1) and day (i).

            diff = b - a;

            // If difference is > max, mark this iteration as the highest.

            if (diff > max) {
                max = diff; 
                v1 = a;
                v2 = b;
                index = i;
            }

            // Set the stage for the next iteration.

            a = b;
        }

        // If there was an increase, print the increase information. Otherwise, notify the user
        // that no increase occurred within the date range.

        if (max > 0) {
            System.out.println("Largest increase of " + max);
            System.out.println("  from " + v1 + " to " + v2);
            System.out.println("  occurred between day #" + index + " and day #" + (index + 1) + ".");
        } else {
            System.out.println("No increase occurred.");
        }
    }
}
