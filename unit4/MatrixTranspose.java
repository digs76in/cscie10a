import java.util.*;

class MatrixTranspose
{
  public static void main (String[] args)
  {
    int[][] arr = { { 3, 6, 9 }, { 4, 1, 5 }, { 5, 8, 7 } };
    int[][] arr1 = transpose(arr);

    for (int i = 0; i < arr1.length; i++) {
      System.out.println(Arrays.toString(arr1[i]));
    }
  }

  private static int[][] transpose (int[][] arr)
  {
    int[][] newArr = new int[arr.length][arr[0].length];

    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        newArr[j][i] = arr[i][j];
      }
    }

    return newArr;
  }
}
