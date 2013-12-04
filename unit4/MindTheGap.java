class MindTheGap
{
  public static void main (String[] args)
  {
    int[] list = {1, 3, 6, 7, 12};
    System.out.println( minGap(list) );
  }

  private static int minGap (int[] arr)
  {
    int diff = 0;
    int min = -1;

    for (int i = 0; i < arr.length; i++) {
      if (i + 1 != arr.length) {
        diff = arr[i] - arr[i + 1];
        diff = (diff < 0) ? diff * -1 : diff;
        min  = (min == -1 || diff < min) ? diff : min;
      }
    }

    return min;
  }
}
