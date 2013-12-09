/**
 * Prints first true, last true, and number of consecutive trues
 * @author Ryan Closner
 * @version 12/3/2012
 **/

class Bool
{

    public static void main (String[] args)
    {
        // Instantiate test values

        boolean [] test1 = { false, true, true, true }; 
        boolean [] test2 = { true }; 
        boolean [] test3 = { true, true, true, true, false };

        // Test values 1..3

        fullOfBool(test1);
        fullOfBool(test2);
        fullOfBool(test3);
    }

    private static void fullOfBool (boolean[] list)
    {
        // Instantiate starter values

        int first = -1; 
        int last  = -1;
        int total = 0;

        // We're assuming that no 'true' values will exist
        // outside of a consecutive sequence (e.g. { true false true true }).
        //                                            ^

        for (int i = 0; i < list.length; i++) {
            if (list[i]) {
                if (first < 0 || i < first) first = i;
                if (first < 0 || i > last) last = i;
                total++;
            }
        }

        // Print first, last, and total within sequence

        System.out.println("First: " + first);
        System.out.println("Last: " + last);
        System.out.println("Total: " + total + "\n");
    }

}
