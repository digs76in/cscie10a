/**
 * Finds the minimum gap (difference) between values within array
 * @author Ryan Closner
 * @version 12/3/2012
 **/

class MindTheGap
{
    public static void main (String[] args)
    {
        // Instantiate test values

        int[] list = {1, 3, 6, 7, 12};

        // Print results

        System.out.println( minGap(list) );
    }

    /**
     * Finds the minimum gap (difference) between values within array
     * @param list the Array to check
     * @return     the number of items in list that fall within min..max
     **/

    private static int minGap (int[] list)
    {
        // Instantiate starter values

        int diff = 0;
        int min = -1;

        // Iterate over list and find the minimum difference

        for (int i = 0; i < list.length; i++) {
            if (i + 1 != list.length) {
                diff = Math.abs(list[i] - list[i + 1]);
                min  = min == -1 || diff < min ? diff : min;
            }
        }

        // Return the minimum difference

        return min;
    }
}
