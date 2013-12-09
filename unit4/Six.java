/**
 * Counts how many items in an array fall within a range
 * @author Ryan Closner
 * @version 12/3/2012
 **/

import java.util.*;

class Six
{

    // The number of items to insert into Array

    final static int SIZE = 5;

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);

        // Gather array of ints to test against

        int list[] = new int[SIZE];
        System.out.print("Please enter "+ SIZE +" numbers: ");
        for (int i = 0; i < SIZE; i++) {
            list[i] = in.nextInt();
        }

        // Gather min of range

        System.out.print("Please enter a min value: ");
        int min = in.nextInt();

        // Gather max of range

        System.out.print("Please enter a max value: ");
        int max = in.nextInt();

        // Print the number of items in Array that fall within range

        System.out.println("The total number of elements within range are: " + countInRange(min, max, list));
    }

    /**
     * Counts the number of items in array that fall within range
     * @param min  the range minimum 
     * @param max  the range maximum
     * @param list the Array to check against
     * @return     the number of items in list that fall within min..max
     **/

    private static int countInRange (int min, int max, int[] list)
    {
        // Set count to 0

        int count = 0; 

        // Count the number of items that fall within min..max

        for (int i = 0; i < list.length; i++) {
            if (list[i] <= max && list[i] >= min) count++;
        }

        return count;
    }
}
