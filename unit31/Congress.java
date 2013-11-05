/**
 * Determines the eligibility of a candidate for the House and Senate.
 * @author Ryan Closner
 * @version 11/5/2012
 **/

import java.util.*;

class Congress
{
    public static void main (String[] args)
    {

        // Instantiate the scanner

        Scanner in = new Scanner( System.in );

        System.out.println("#############################################");
        System.out.println("CONGRESS ELIGIBILITY\n");

        // Gather input from user.

        System.out.print("Enter age of candidate: ");
        int age = in.nextInt();

        System.out.print("Enter years of U.S. citizenship: ");
        int lengthOfCitizenship = in.nextInt();

        // Determine eligibility

        boolean house  = eligibleForHouse(age, lengthOfCitizenship);
        boolean senate = eligibleForSenate(age, lengthOfCitizenship);
    
        System.out.println();

        // Print eligibility

        if (!house && !senate) {

            System.out.println("The candidate is NOT eligible for election to either the");
            System.out.println("House of Representatives or the Senate.");

        } else if (house && !senate) {

            System.out.println("The candidate is eligible for election to the House of");
            System.out.println("Representatives but is NOT eligible for election to the");
            System.out.println("Senate.");

        } else {

            System.out.println("The candidate is eligible for election to both the");
            System.out.println("House of Representatives and the Senate.");

        }

        System.out.println("\n#############################################\n");
    }

    /**
     * Determines the candidates eligibility for Senate.
     * @param age                 the age of the candidate
     * @param lengthOfCitizenship the length of the candidate's citizenship.
     * @return                    the candidate's eligibility.
     **/

    private static boolean eligibleForSenate (int age, int lengthOfCitizenship)
    {
        return age >= 30 && lengthOfCitizenship >= 9;
    }

    /**
     * Determines the candidates eligibility for the House of Representatives.
     * @param age                 the age of the candidate
     * @param lengthOfCitizenship the length of the candidate's citizenship.
     * @return                    the candidate's eligibility.
     **/

    private static boolean eligibleForHouse (int age, int lengthOfCitizenship)
    {
        return age >= 25 && lengthOfCitizenship >= 7;
    }
}
