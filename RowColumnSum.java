import java.util.Scanner;

public class RowColumnSum {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt(), c = sc.nextInt();
    int[][] mat = new int[r][c];
    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++)
        mat[i][j] = sc.nextInt();
    for (int i = 0; i < r; i++) {
      int rowSum = 0;
      for (int j = 0; j < c; j++)
        rowSum += mat[i][j];
      System.out.println("Sum of row " + i + ": " + rowSum);
    }
    for (int j = 0; j < c; j++) {
      int colSum = 0;
      for (int i = 0; i < r; i++)
        colSum += mat[i][j];
      System.out.println("Sum of column " + j + ": " + colSum);
    }
  }
}