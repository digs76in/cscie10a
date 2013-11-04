/**
 * Determines the date of Easter for a given year.
 * @author Ryan Closner
 * @version 10/18/2012
 **/

import java.util.*;

class Easter
{

    public static void main(String [] args)
    {
        // Request the year from the user.

        Scanner in = new Scanner( System.in );
        System.out.print("Enter the year: ");

        // Assign the year to the value.

        int year = in.nextInt();

        // Get the date of Easter for year (year).

        String date = computeEaster(year);

        // Print the date of Easter for year (year).

        System.out.println("Easter is on "+ date);
    }

    /**
     * Computs the date of Easter for a given year
     * @param year                         the year to calculate Easter's date
     * @exception IllegalArgumentException if the year is less than zero.
     * @return                             the date on which Easter fell
     **/

    static String computeEaster(int year)
    {
        // Throw exception if year is invalid.

        if (year < 0) {
            throw new IllegalArgumentException("year must be greater than zero.");
        }

        // Compute the date using Gauss' formula.

        int a = year % 19; 
        int b = year / 100;
        int c = year % 100;
        int d = b / 4;
        int e = b % 4;
        int g = (8 * b + 13) / 25;
        int h = (19 * a + b - d - g + 15) % 30;
        int j = c / 4;
        int k = c % 4;
        int m = (a + 11 * h) / 319;
        int r = (2 * e + 2 * j - k - h - m + 32) % 7;
        int n = (h - m + r + 90) / 25;
        int p = (h - m + r + n + 19) % 32;

        // Get the name of the month.

        String month = determineMonth(n);

        // Return the date.

        return "" + month + " " + p + ", " + year;
    }

    /**
     * Returns the name of the month for a given index
     * @param i                            the month index
     * @exception IllegalArgumentException if the month index is invalid
     * @return                             the name of the month
     **/

    private static String determineMonth (int i)
    {
        // Return the name of the month for a given index.

        if (i == 1) {
            return "January";
        } else if (i == 2) {
            return "February";
        } else if (i == 3) {
            return "March";
        } else if (i == 4) {
            return "April";
        } else if (i == 5) {
            return "May";
        } else if (i == 6) {
            return "June";
        } else if (i == 7) {
            return "July";
        } else if (i == 8) {
            return "August";
        } else if (i == 9) {
            return "September";
        } else if (i == 10) {
            return "October";
        } else if (i == 11) {
            return "November";
        } else if (i == 12) {
            return "December";
        } else {
            throw new IllegalArgumentException("month index is not valid!");
        }
    }

}
