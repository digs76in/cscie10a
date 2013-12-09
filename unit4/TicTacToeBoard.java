/**
 * A Tic Tac Toe Board
 * @author Ryan Closner
 * @version 12/3/2012
 **/

class TicTacToeBoard
{
    // Instantiate valid position values

    private char EMPTY = ' ';
    private char X     = 'X';
    private char O     = 'O';

    // Instantiate initial position values

    private char[][] POSITIONS = {
        { EMPTY, EMPTY, EMPTY },
        { EMPTY, EMPTY, EMPTY }, 
        { EMPTY, EMPTY, EMPTY } 
    };

    // Instantiate winning board patterns

    private int[][][] WINNING_PATTERNS = {
        { { 0, 0 }, { 1, 0 }, { 2, 0 } },
        { { 0, 1 }, { 1, 1 }, { 2, 1 } },
        { { 0, 2 }, { 1, 2 }, { 2, 2 } },
        { { 0, 0 }, { 0, 1 }, { 0, 2 } },
        { { 1, 0 }, { 1, 1 }, { 1, 2 } },
        { { 2, 0 }, { 2, 1 }, { 2, 2 } },
        { { 0, 0 }, { 1, 1 }, { 2, 2 } },
        { { 2, 0 }, { 1, 1 }, { 0, 2 } }
    };

    /**
     * Getter method for position
     * @param x the x coord of the position
     * @param y the y coord of the position
     * @return  the value at position (x,y)
     **/

    public char getPosition (int x, int y) {
        return POSITIONS[x][y];
    }

    /**
     * Setter method for position (raises exception if
     * position is invalid or already set)
     * @param x     the x coord of the position
     * @param y     the y coord of the position
     * @param value the value to set
     **/

    public void setPosition (int x, int y, char value)
    {
        if ( canSetPosition(x, y) ) {
            POSITIONS[x][y] = value;
        } else {
            throw new IllegalArgumentException("position cannot be set");
        } 
    }

    /**
     * Checks to see if a position can be set.
     * @param x the x coord of the position
     * @param y the y coord of the position
     * @return  whether or not the position can be set   
     **/

    private boolean canSetPosition (int x, int y)
    {
        return positionIsValid(x, y) && getPosition(x, y) == EMPTY;
    }

    /**
     * Validation method for position
     * @param x the x coord of the position
     * @param y the y coord of the position
     * @return  whether or not the position is valid
     **/

    private boolean positionIsValid (int x, int y) {
        return x >= 0 && x < 3 && y >= 0 && y < 3;
    }

    /**
     * Checks to see if any of the winning patterns apply to the board
     * @return  whether or not any of the winning patterns apply to the board
     **/

    public boolean isWin ()
    {
        // Iterate over every winning pattern

        for (int i = 0; i < WINNING_PATTERNS.length; i++) {

            // Grab the pattern

            int[][] pattern = WINNING_PATTERNS[i];

            // Set variables

            boolean xWin = true;
            boolean oWin = true;

            // Iterate over every position within the pattern.

            for (int j = 0; j < pattern.length; j++) {

                int x = pattern[j][0];
                int y = pattern[j][1];

                char value = POSITIONS[x][y];

                // Check to see if x or o is set

                if (value != X) xWin = false;
                if (value != O) oWin = false;
            }

            // If all x's or o's return true

            if (xWin || oWin) return true;
        }
        
        // Default to false

        return false;
    }

    /**
     * Checks to see if all of the positions have been filled
     * @return  whether or not all of the position have been filled
     **/

    public boolean isTie ()
    {
        // Iterate over every position

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {

                // Break if one is empty

                if (POSITIONS[x][y] == EMPTY) return false;
            }
        }

        // Default to true

        return true;
    }

    /**
     * Returns a graphical representation of the board
     * @return a graphical representation of the board
     **/

    public String toString ()
    {
        // Instantiate the string

        String str = "";

        // Iterate over every position

        for (int y = 0; y < 3; y++) {

            // Add left boundary

            str += "|";

            for (int x = 0; x < 3; x++) {

                // Add value to string

                str += " " + getPosition(x, y) + " ";
           }

           // Add right boundary

            str += "|\n";
        }

        // Return string

        return str;
    }

}
