class Bool
{

  public static void main (String[] args)
  {
    boolean [] test1 = { false, true, true, true }; 
    boolean [] test2 = { true }; 
    boolean [] test3 = { true, true, true, true, false };

    fullOfBool(test1);
    fullOfBool(test2);
    fullOfBool(test3);
  }

  private static void fullOfBool (boolean[] range)
  {
    int first = -1; 
    int last  = -1;
    int total = 0;

    for (int i = 0; i < range.length; i++) {
      if (range[i]) {
        if (first < 0 || i < first) first = i;
        if (first < 0 || i > last) last = i;
        total++;
      }
    }

    System.out.println("First: " + first);
    System.out.println("Last: " + last);
    System.out.println("Total: " + total + "\n");
  }

}
