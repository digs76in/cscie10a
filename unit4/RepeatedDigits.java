import java.util.*;

class RepeatedDigits
{

  public static void main (String[] args)
  {

    Scanner in = new Scanner(System.in);
    System.out.print("Please enter an integer: ");
    int num = in.nextInt();
    num = (num < 0) ? (num * -1) : num;

    int[] occurrences = new int[10];
    for (int i = 0; i < 10; i++) {
      occurrences[i] = countOccurrences(i, num);
    }

    String digitString = "Digit:       ";
    for (int i = 0; i < occurrences.length; i++) {
      digitString += " " + i + " ";
    }

    System.out.println(digitString);

    String occurrencesString = "Occurrences: ";
    for (int i = 0; i < occurrences.length; i++) {
      occurrencesString += " " + occurrences[i] + " ";
    }

    System.out.println(occurrencesString);
  }

  private static int countOccurrences (int digit, int num)
  {
    int count = 0;
    while (num > 0) {
      if (num % 10 == digit) count++;
      num /= 10;
    }
    return count;
  }
  
}
