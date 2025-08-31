abstract class Product {
  abstract double calculateDiscount(double p);

  abstract void displayProductDetails();
}

class Electronics extends Product {
  double calculateDiscount(double p) {
    return p * 0.9;
  }

  void displayProductDetails() {
    System.out.println("Electronics");
  }
}

class Clothing extends Product {
  double calculateDiscount(double p) {
    return p * 0.8;
  }

  void displayProductDetails() {
    System.out.println("Clothing");
  }
}

class Grocery extends Product {
  double calculateDiscount(double p) {
    return p * 0.95;
  }

  void displayProductDetails() {
    System.out.println("Grocery");
  }
}

public class CartMain {
  public static void main(String[] a) {
    Product p = new Electronics();
    p.displayProductDetails();
    System.out.println(p.calculateDiscount(1000));
    p = new Clothing();
    p.displayProductDetails();
    System.out.println(p.calculateDiscount(500));
  }
}
