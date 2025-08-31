import java.util.Scanner;

public class MagicSquare {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        mat[i][j] = sc.nextInt();
    int magicSum = 0;
    for (int j = 0; j < n; j++)
      magicSum += mat[0][j];
    boolean isMagic = true;
    for (int i = 1; i < n; i++) {
      int rowSum = 0;
      for (int j = 0; j < n; j++)
        rowSum += mat[i][j];
      if (rowSum != magicSum)
        isMagic = false;
    }
    for (int j = 0; j < n; j++) {
      int colSum = 0;
      for (int i = 0; i < n; i++)
        colSum += mat[i][j];
      if (colSum != magicSum)
        isMagic = false;
    }
    int diag1 = 0, diag2 = 0;
    for (int i = 0; i < n; i++) {
      diag1 += mat[i][i];
      diag2 += mat[i][n - 1 - i];
    }
    if (diag1 != magicSum || diag2 != magicSum)
      isMagic = false;
    System.out.println("Matrix is " + (isMagic ? "" : "not ") + "a magic square.");
  }
}