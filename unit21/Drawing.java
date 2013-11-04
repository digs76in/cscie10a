class Drawing
{

  public static void main (String [] args)
  {
    shape();

    spacer();

    line();

    spacer();

    shape();

    spacer();

    line();
    bottom();

    spacer();

    top();
    line();
    bottom();
  }

  public static void spacer()
  {
    System.out.println();
    System.out.println();
  }

  public static void shape()
  {
    top(); 
    bottom();
  }

  static void top()
  {
    System.out.println("  -------  ");
    System.out.println(" /       \\ ");
    System.out.println("/         \\");
  }

  static void bottom()
  {
    System.out.println("\\         /");
    System.out.println(" \\_______/ ");
  }

  static void line()
  {
    System.out.println("-\"-'-\"-'-\"-");
  }


}
