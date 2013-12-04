import java.util.*;

class TestStretch
{

  public static void main (String[] args)
  {
    int[] list = {18, 7, 4, 14, 11};   
    int[] list2 = stretch(list);

    System.out.println(Arrays.toString(list));
    // the above prints [18, 7, 4, 24, 11]!

    System.out.println(Arrays.toString(list2));
    // the above prints [9, 9, 4, 3, 2, 2, 7, 7, 6, 5]
  }

  private static int[] stretch (int[] arr)
  {
    int[] newArr = new int[ arr.length * 2 ];

    int a = 0;
    int b = 0;

    for (int i = 0; i < arr.length; i++) {
      int num = arr[i];

      a = num / 2;
      b = num / 2;

      while (num % (a + b) != 0) {
        a = (a + b > num) ? (a - 1) : (a + 1);
      }

      newArr[i * 2] = a;
      newArr[i * 2 + 1] = b;
    }

    return newArr;
  }
}
