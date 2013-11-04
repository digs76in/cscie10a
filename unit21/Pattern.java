class Pattern
{

  static final int HEIGHT = 5;

  public static void main(String[] args)
  {
    for (int i = HEIGHT; i > 0; i--) {
      for (int j = 0; j < (HEIGHT - i); j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
