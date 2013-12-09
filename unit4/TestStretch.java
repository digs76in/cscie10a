/**
 * Stretches an array of ints by creating an array
 * containing pairs of ints whose sum equals the original
 * int in the array.
 * @author Ryan Closner
 * @version 12/3/2012
 **/

class TestStretch
{

    public static void main (String[] args)
    {
        // Instantiate test values

        int[] list = { 18, 7, 4, 14, 11 };
        int[] list2 = stretch(list);

        // Prints [ 18, 7, 4, 24, 11 ]

        System.out.println(Arrays.toString(list));

        // Prints [ 9, 9, 4, 3, 2, 2, 7, 7, 6, 5 ]

        System.out.println(Arrays.toString(list2));
    }

    /**
     * Stretches an array of ints by creating an array
     * containing pairs of ints whose sum equals the original
     * int in the array
     * @param list the array to stretch
     * @return     the stretched array
     **/

    private static int[] stretch (int[] list)
    {
        // Instantiate a new Array

        int[] newList = new int[ list.length * 2 ];

        // Instantiates two ints to test with

        int a = 0;
        int b = 0;

        // Iterate over every value within array

        for (int i = 0; i < list.length; i++) {
            int num = list[i];

            // Start with the number divided by two

            a = num / 2;
            b = num / 2;
            
            // While a + b != num, continue trying new numbers

            while (num % (a + b) != 0) {
                a = (a + b > num) ? (a - 1) : (a + 1);
            }

            // Insert a and b into their appropriate positions within
            // the new array

            newList[i * 2] = a;
            newList[i * 2 + 1] = b;
        }

        // Return the new array

        return newList;
    }
}
