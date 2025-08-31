import java.util.Scanner;

public class MatrixTranspose {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt(), cols = sc.nextInt();
    int[][] matrix = new int[rows][cols];
    for (int i = 0; i < rows; i++)
      for (int j = 0; j < cols; j++)
        matrix[i][j] = sc.nextInt();
    System.out.println("Original Matrix:");
    for (int[] row : matrix) {
      for (int val : row)
        System.out.print(val + " ");
      System.out.println();
    }
    System.out.println("Transpose:");
    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++)
        System.out.print(matrix[j][i] + " ");
      System.out.println();
    }
  }
}