import java.util.Scanner;

public class MinMaxInMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt(), c = sc.nextInt();
    int[][] mat = new int[r][c];
    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
    int minRow = 0, minCol = 0, maxRow = 0, maxCol = 0;
    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++) {
        mat[i][j] = sc.nextInt();
        if (mat[i][j] < min) {
          min = mat[i][j];
          minRow = i;
          minCol = j;
        }
        if (mat[i][j] > max) {
          max = mat[i][j];
          maxRow = i;
          maxCol = j;
        }
      }
    System.out.println("Min: " + min + " at (" + minRow + "," + minCol + ")");
    System.out.println("Max: " + max + " at (" + maxRow + "," + maxCol + ")");
  }
}