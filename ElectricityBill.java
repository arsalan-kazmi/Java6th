import java.util.*;

interface BillCalculator {
  double calculateBill(int u);
}

class ElectricityBoard implements BillCalculator {
  public double calculateBill(int u) {
    if (u <= 100)
      return u * 1.5;
    else if (u <= 200)
      return 100 * 1.5 + (u - 100) * 2;
    else
      return 100 * 1.5 + 100 * 2 + (u - 200) * 3;
  }
}

public class ElectricityBill {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    ElectricityBoard eb = new ElectricityBoard();
    try {
      System.out.println(eb.calculateBill(sc.nextInt()));
    } catch (InputMismatchException e) {
      System.out.println("Invalid");
    }
  }
}
