import java.util.Scanner;

public class SymmetricMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] mat = new int[n][n];
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        mat[i][j] = sc.nextInt();
    boolean isSymmetric = true;
    for (int i = 0; i < n; i++)
      for (int j = 0; j < n; j++)
        if (mat[i][j] != mat[j][i])
          isSymmetric = false;
    System.out.println("Matrix is " + (isSymmetric ? "" : "not ") + "symmetric.");
  }
}