import java.util.*;

class Six
{
  final static int SIZE = 5;

  public static void main (String[] args)
  {
    Scanner in = new Scanner(System.in);

    int range[] = new int[SIZE];
    System.out.print("Please enter "+ SIZE +" numbers: ");
    for (int i = 0; i < SIZE; i++) {
      range[i] = in.nextInt();
    }

    System.out.print("Please enter a min value: ");
    int min = in.nextInt();

    System.out.print("Please enter a max value: ");
    int max = in.nextInt();

    System.out.println("The total number of elements within range are: " + countInRange(min, max, range));
  }

  private static int countInRange (int min, int max, int[] range)
  {
    int count = 0; 
    for (int i = 0; i < range.length; i++) {
      if (range[i] <= max && range[i] >= min) count++;
    }
    return count;
  }
}
