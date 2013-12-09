/**
 * A Game of Tic Tac Toe
 * @author Ryan Closner
 * @version 12/3/2012
 **/

import java.util.*;

public class TicTacToe
{

    // Declare scanner variable

    private Scanner in;

    // Declare player variables

    private TicTacToePlayer playerOne;
    private TicTacToePlayer playerTwo;
    private TicTacToePlayer currentPlayer;

    // Instantiate board variables

    private TicTacToeBoard board = new TicTacToeBoard();

    // Instantiate game variables

    private boolean playing = true;

    /**
     * Constructor for TicTacToe
     **/

    TicTacToe (Scanner startIn, TicTacToePlayer one, TicTacToePlayer two)
    {
        in = startIn;
        playerOne = one; 
        playerTwo = two;
    }

    /**
     * Plays the game until someone has won
     **/

    public void play ()
    {
        int turn = 0;

        // Play while flag is true

        while (playing) {
            // Increment turn

            turn++;

            // Set current player

            currentPlayer = (turn % 2 == 1) ? playerOne : playerTwo;

            // Attempt a move

            System.out.println("It is " + currentPlayer.name + "'s turn.");
            move();


            // End the game if tie or win

            if ( board.isWin() ) {
                win();
            } else if ( board.isTie() ) {
                tie(); 
            }
        }
    }

    /**
     * Ends the game and prints winning message
     **/

    public void win ()
    {
        playing = false;
        System.out.println("Game Over - " + currentPlayer.name + " WINS!!!");
    }

    /**
     * Ends the game and prints tie message
     **/

    public void tie ()
    {
        playing = false;
        System.out.println("Game Over - Tie Game!!!");
    }

    /**
     * Gets the desired move, and attempts the move
     * If  the current move is illegal, it gets another move 
     * from the player. If it is legal, it makes the move.
     **/

    private void move ()
    {
        // Get row

        System.out.print("Pick a row between 1 and 3: ");
        int y = in.nextInt() - 1;

        // Get column

        System.out.print("Pick a column between 1 and 3: ");
        int x = in.nextInt() - 1;

        // If legal move, fill the square and print the board

        try {
            board.setPosition( x, y, currentPlayer.marker );
            System.out.println( board.toString() );
        } catch (IllegalArgumentException e) {
            System.out.println("ILLEGAL CHOICE! TRY AGAIN...");
            move();
        }
    }

    public static void main (String[] args)
    {
        String name;
        Scanner in = new Scanner( System.in );

        // Print introduction

        System.out.println("Welcome! Tic-Tac-Toe is a two player game.");

        // Create player one

        System.out.print("Enter player one's name: ");
        name = in.nextLine();

        TicTacToePlayer one = new TicTacToePlayer(name, 'X');

        // Create player two

        System.out.print("Enter player two's name: ");
        name = in.nextLine();

        TicTacToePlayer two = new TicTacToePlayer(name, 'O');

        // Create game

        TicTacToe game = new TicTacToe(in, one, two);

        // Print instructions

        System.out.println("Players take turns marking a square. Only squares");
        System.out.println("not already marked can be picked. Once a player has");
        System.out.println("marked three squares in a row, he or she wins! If all squares");
        System.out.println("are marked and no three squares are the same, a tied game is declared.");
        System.out.println("Have Fun!\n");

        // Play game

        game.play();
    }

}
