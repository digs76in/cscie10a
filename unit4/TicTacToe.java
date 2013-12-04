import java.util.*;

public class TicTacToe
{

  private boolean playing = true;
  private Scanner in = new Scanner(System.in);
  private String playerOne;
  private String playerTwo;
  private int turn = 0;
  private TicTacToeBoard board = new TicTacToeBoard();

  private void win ()
  {
    playing = false; 
    System.out.println("Game Over - "+ current() +" WINS!!!");
  }

  private void tie ()
  {
    playing = false;
    System.out.println("Game Over - Tie!!!");
  }

  private String current ()
  {
    return (turn % 2 == 0) ? playerTwo : playerOne; 
  }

  private void move ()
  {
    // Get move location

    System.out.print("Pick a row between 1 and 3: ");
    int row = in.nextInt();

    System.out.print("Pick a column between 1 and 3: ");
    int col = in.nextInt();

    // If valid move, fill the square and print the board

    if ( row > 0 && row < 4 && col > 0 && col < 4 && board.canMove(row, col) ) {
      board.move(turn % 2, row, col);
      System.out.println("Game board:");
      System.out.println(board.toString());
    } else {
      System.out.println("ILLEGAL CHOICE! TRY AGAIN...");
      move(); 
    }
  }

  public void play ()
  {
    System.out.println("Welcome! Tic-Tac-Toe is a two player game.");

    // Get Player Names

    System.out.print("Enter player one's name: ");
    playerOne = in.nextLine();

    System.out.print("Enter player two's name: ");
    playerTwo = in.nextLine();

    // Give instructions

    System.out.println("Players take turns marking a square. Only squares");
    System.out.println("not already marked can be picked. Once a player has");
    System.out.println("marked three squares in a row, he or she wins! If all squares");
    System.out.println("are marked and no three squares are the same, a tied game is declared.");
    System.out.println("Have Fun!");

    while (playing) {

      // Increment the turn

      turn++;

      // Get the move

      System.out.println("It is " + current() + "'s turn.");
      move();

      // End the game if possible
      
      if (board.isWin()) win();
      if (board.isTie()) tie();
    }
  }

  public static void main (String[] args)
  {
    TicTacToe game = new TicTacToe();
    game.play();
  }

}
