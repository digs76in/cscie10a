/**
 * Walks a student home (spoiler: she's drunk).
 * @author Ryan Closner
 * @version 11/5/2012
 **/

import java.util.*;

class Drunk
{
    // Instantiate location variables

    private static final int START = 5;
    private static final int HOME = 0;
    private static final int JAIL = 10;

    // Number of times to walk

    private static final int N = 5;

    // Drunk walk N times

    public static void main (String[] args)
    {
        int steps;
        String location;

        for (int i = 0; i < N; i++) {
            steps = drunkWalk(); 

            // If steps is negative, student is in jail. Otherwise she is at home.

            if (steps < 0) {
                steps = steps * -1; 
                location = "in JAIL";
            } else {
                location = "at HOME";
            }

            // Print walk details.

            System.out.println("Here we go again... time for a walk!");
            System.out.println("Took " + steps + " steps, and");
            System.out.println("Landed " + location);
            System.out.println();
        }
    }

    /**
     * Walks the student until she has reached home or jail
     * @return the number of steps taken (negative means she is in jail, positive means at
     * home).
     **/
    private static int drunkWalk ()
    {
        // Initial location set to start.

        int location = START; 

        // Initial location set to 0.

        int steps = 0;

        // Initialize number generator.

        Random generator = new Random();

        // 0.5 chance she walks towards home or jail.

        while (location != HOME && location != JAIL)
        {
            location += (generator.nextInt(2) == 0) ? -1 : 1;
            steps++;
        }

        // If she is at home, return positive. Otherwise return negative.

        return (location == HOME) ? steps : -steps;
    }

}
