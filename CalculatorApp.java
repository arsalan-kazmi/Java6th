import java.util.*;

interface Calculator {
  int add(int a, int b);

  int subtract(int a, int b);

  int multiply(int a, int b);

  int divide(int a, int b);
}

class SimpleCalculator implements Calculator {
  public int add(int a, int b) {
    return a + b;
  }

  public int subtract(int a, int b) {
    return a - b;
  }

  public int multiply(int a, int b) {
    return a * b;
  }

  public int divide(int a, int b) {
    return a / b;
  }
}

public class CalculatorApp {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    SimpleCalculator c = new SimpleCalculator();
    try {
      int x = sc.nextInt(), y = sc.nextInt();
      System.out.println(c.add(x, y));
      System.out.println(c.subtract(x, y));
      System.out.println(c.multiply(x, y));
      System.out.println(c.divide(x, y));
    } catch (Exception e) {
      System.out.println("Error");
    }
  }
}
