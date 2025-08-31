import java.util.*;

interface ArrayOperations {
  void insert(int i, int v);

  int search(int v);

  void display();
}

class ArrayManager implements ArrayOperations {
  int[] arr = new int[5];

  public void insert(int i, int v) {
    arr[i] = v;
  }

  public int search(int v) {
    for (int i = 0; i < arr.length; i++)
      if (arr[i] == v)
        return i;
    return -1;
  }

  public void display() {
    for (int x : arr)
      System.out.print(x + " ");
    System.out.println();
  }
}

public class ArrayOperationsApp {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    ArrayManager m = new ArrayManager();
    try {
      m.insert(sc.nextInt(), sc.nextInt());
      m.display();
      System.out.println(m.search(sc.nextInt()));
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("Index error");
    }
  }
}
