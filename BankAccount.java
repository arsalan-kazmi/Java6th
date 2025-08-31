import java.util.*;

class BankAccount {
  int acc;
  String name;
  double bal;

  void deposit(double amt) {
    bal += amt;
  }

  void withdraw(double amt) {
    if (bal >= amt)
      bal -= amt;
  }

  void display() {
    System.out.println(acc + " " + name + " " + bal);
  }

  public static void main(String[] a) {
    BankAccount b = new BankAccount();
    b.acc = 1;
    b.name = "A";
    b.bal = 1000;
    b.deposit(500);
    b.withdraw(200);
    b.display();
  }
}
