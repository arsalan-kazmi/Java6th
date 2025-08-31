import java.util.*;

interface Checkout {
  void processPayment(double amt);
}

class OnlineCart implements Checkout {
  public void processPayment(double amt) {
    if (amt <= 0)
      throw new IllegalArgumentException();
    System.out.println("Paid: " + amt);
  }
}

public class ECommerceCheckout {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    OnlineCart c = new OnlineCart();
    try {
      c.processPayment(sc.nextDouble());
    } catch (Exception e) {
      System.out.println("Invalid");
    }
  }
}
