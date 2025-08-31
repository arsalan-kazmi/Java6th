package Matrix;

import java.util.Scanner;

public class MatrixAddition {
  public static void main(String[] args) {
    int[][] a = new int[3][3], b = new int[3][3], sum = new int[3][3];
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter elements of Matrix A:");
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        a[i][j] = sc.nextInt();
    System.out.println("Enter elements of Matrix B:");
    for (int i = 0; i < 3; i++)
      for (int j = 0; j < 3; j++)
        b[i][j] = sc.nextInt();
    System.out.println("Sum of matrices:");
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        sum[i][j] = a[i][j] + b[i][j];
        System.out.print(sum[i][j] + " ");
      }
      System.out.println();
    }
  }
}