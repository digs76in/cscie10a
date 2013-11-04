/**
 * Determines the classification of a donor based upon
 * the amount that they donate.
 * @author Ryan Closner
 * @version 10/18/2012
 **/

import java.util.*;

class Donor
{

    public static void main(String[] args)
    {
        // Request the amount from the user.

        Scanner in = new Scanner( System.in );
        System.out.print("Enter the amount of a contribution: $");

        // Assign the amount to a variable.

        double amount = in.nextDouble();

        // Determine donor classification.

        String classification = donor(amount);

        // Print the classification.

        System.out.println(classification);
    }

    /**
     * Determines the donor classification
     * @param     amount                    the amount of the donation
     * @exception IllegalArgumentException  if input is less than zero
     * @return                              the classification of the donor
     **/

    static String donor(double amount)
    {
        // Instantiate the designation variable.

        String designation;

        // Assign the designation based upon amount.

        if ( amount >= 1000.00) {
            designation = "Benefactor";
        } else if ( amount < 1000.00 && amount >= 500.00 ) {
            designation = "Patron";
        } else if ( amount < 500.00 && amount >= 100.00 ) {
            designation = "Supporter";
        } else if ( amount < 100.00 && amount >= 15.00 ) {
            designation = "Friend";
        } else if ( amount < 15.00 && amount >= 0.0 ){
            designation = "Cheapskate";
        } else {
            throw new IllegalArgumentException("amount must be greater than zero.");
        }

        // Return the designation.

        return (designation + "!");
    }
}
