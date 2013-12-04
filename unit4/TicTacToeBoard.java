class TicTacToeBoard
{

  private int O = 0;
  private int X = 1;

  private int BLANK = -1;

  private int[][] SQUARES = {
    { -1, -1, -1 },
    { -1, -1, -1 },
    { -1, -1, -1 }
  };

  private int[][][] WINNERS = {
    { { 0, 0 }, { 1, 0 }, { 2, 0 } },
    { { 0, 1 }, { 1, 1 }, { 2, 1 } },
    { { 0, 2 }, { 1, 2 }, { 2, 2 } },
    { { 0, 0 }, { 0, 1 }, { 0, 2 } },
    { { 1, 0 }, { 1, 1 }, { 1, 2 } },
    { { 2, 0 }, { 2, 1 }, { 2, 2 } },
    { { 0, 0 }, { 1, 1 }, { 2, 2 } },
    { { 2, 0 }, { 1, 1 }, { 0, 2 } }
  };

  public boolean canMove (int row, int col)
  {
    return SQUARES[row - 1][col - 1] == BLANK;
  }

  public void move (int player, int row, int col) {
    SQUARES[row - 1][col - 1] = player;
  }

  public boolean isWin ()
  {
    for (int i = 0; i < WINNERS.length; i++)  {

      boolean x = true; 
      boolean o = true;

      for (int j = 0; j < 3; j++) {
        int value = SQUARES[ WINNERS[i][j][0] ][ WINNERS[i][j][1] ]; 
        if (value != X) x = false;
        if (value != O) o = false;
      }

      if (x || o) return true;
    }

    return false;
  }

  public boolean isTie ()
  {
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (SQUARES[i][j] == BLANK) return false;
      }
    }

    return true;
  }

  public String toString ()
  {
    String str = "";

    for (int i = 0; i < 3; i++) {
      str += "|";

      for (int j = 0; j < 3; j++) {
        switch (SQUARES[i][j]) {
          case 0:
            str += " O ";
            break;
          case 1:
            str += " X ";
            break;
          default:
            str += "   ";
            break;
        }
      }

      str += "|\n";
    }

    return str;
  }

}
