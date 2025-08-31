abstract class Payment {
  abstract void validate();

  abstract void pay();
}

class CreditCardPayment extends Payment {
  void validate() {
    System.out.println("CC validated");
  }

  void pay() {
    System.out.println("CC paid");
  }
}

class UPIPayment extends Payment {
  void validate() {
    System.out.println("UPI validated");
  }

  void pay() {
    System.out.println("UPI paid");
  }
}

class WalletPayment extends Payment {
  void validate() {
    System.out.println("Wallet validated");
  }

  void pay() {
    System.out.println("Wallet paid");
  }
}

public class PaymentMain {
  public static void main(String[] a) {
    Payment p = new CreditCardPayment();
    p.validate();
    p.pay();
    p = new UPIPayment();
    p.validate();
    p.pay();
  }
}
