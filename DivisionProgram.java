import java.util.*;

public class DivisionProgram {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    try {
      int x = sc.nextInt(), y = sc.nextInt();
      System.out.println(x / y);
    } catch (ArithmeticException e) {
      System.out.println("Division by zero");
    } catch (InputMismatchException e) {
      System.out.println("Invalid input");
    }
  }
}
