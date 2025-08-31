import java.util.Scanner;

public class SearchInMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt(), c = sc.nextInt();
    int[][] mat = new int[r][c];
    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++)
        mat[i][j] = sc.nextInt();
    int key = sc.nextInt();
    boolean found = false;
    for (int i = 0; i < r; i++)
      for (int j = 0; j < c; j++)
        if (mat[i][j] == key) {
          System.out.println("Element found at (" + i + "," + j + ")");
          found = true;
        }
    if (!found)
      System.out.println("Element not found.");
  }
}