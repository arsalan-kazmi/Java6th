import java.util.*;

interface BankAccount {
  void deposit(double a);

  void withdraw(double a);

  double getBalance();
}

class SavingsAccount implements BankAccount {
  double bal;

  public void deposit(double a) {
    bal += a;
  }

  public void withdraw(double a) {
    bal -= a;
  }

  public double getBalance() {
    return bal;
  }
}

public class BankApp {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    SavingsAccount sa = new SavingsAccount();
    try {
      sa.deposit(sc.nextDouble());
      sa.withdraw(sc.nextDouble());
      System.out.println(sa.getBalance());
    } catch (Exception e) {
      System.out.println("Error");
    }
  }
}
