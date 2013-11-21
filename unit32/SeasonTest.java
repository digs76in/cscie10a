/**
 * Determines the season based upon month and day
 * @author Ryan Closner
 * @version 11/21/2012
 **/

import java.util.*;

public class SeasonTest
{

    // Define season string constants.

    private static final String WINTER = "Winter";
    private static final String SPRING = "Spring";
    private static final String SUMMER = "Summer";
    private static final String FALL   = "Fall";

    public static void main (String[] args)
    {

        // Grab input from user.

        Scanner in = new Scanner( System.in );
        System.out.print("Please enter a month: ");
        int month = in.nextInt(); 
        System.out.print("Please enter a day: ");
        int day = in.nextInt();

        // Validate user input and print season if valid.

        if (validateInput(month, day)) {
            System.out.println( "The season is: " + season(month, day) );
        } else {
            System.out.println("Impossible!");
        }
    }

    /**
     * Determines whether the value is a valid date.
     * @param month the inputted month
     * @param day   the inputted day
     * @return      whether the value is a valid date.
     **/

    private static boolean validateInput (int month, int day)
    {
        // Quick day check.

        if (day <= 0 || day > 31) {
            return false; 
        }

        // Quick month check.

        if (month <= 0 || month > 12) {
            return false; 
        }

        // Check months with 30 days.

        if ((month == 9 || month == 4 || month == 6 || month == 11) && (day > 30)) {
            return false;
        }

        // Check February.

        if (month == 2 && day > 28) {
            return false; 
        }

        // Valid date.

        return true;        
    }

    /**
     * Determines what season a date falls within.
     * @param month the month
     * @param day   the day
     * @return      the season of the date.
     **/

    private static String season (int month, int day)
    {

        // Determine what range the date falls within.

        if (withinRange(month, day, 3, 16, 6, 15)) {
            return SPRING;
        } else if (withinRange(month, day, 6, 16, 9, 15)) {
            return SUMMER;
        } else if (withinRange(month, day, 9, 16, 12, 15)) {
            return FALL;
        } else {
            return WINTER; 
        }
    }

    /**
     * Determines whether a date falls within a given date range
     * @param month the month
     * @param day   the day
     * @param m1    the min month
     * @param d1    the min day
     * @param m2    the max month
     * @param d2    the max day
     * @return      whether or not the date falls within the date range.
     **/

    private static boolean withinRange (int month, int day, int m1, int d1, int m2, int d2)
    {
        // Falls in min month and is greater than min date.

        if (month == m1 && day >= d1) {
            return true;  
        }

        // Falls in max month and is less than max date.

        if (month == m2 && day <= d2) {
            return true; 
        }

        // Falls within the months between min and max.

        if (month > m1 && month < m2) {
            return true; 
        }

        // Does not fall within range.

        return false;
    }
}
