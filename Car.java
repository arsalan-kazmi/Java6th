import java.util.*;

class Car {
  String model;
  int year;
  double price;

  void input() {
    Scanner sc = new Scanner(System.in);
    model = sc.next();
    year = sc.nextInt();
    price = sc.nextDouble();
  }

  void display() {
    System.out.println(model + " " + year + " " + price);
  }

  static void filter(Car[] c, double amt) {
    for (Car x : c)
      if (x.price > amt)
        x.display();
  }

  public static void main(String[] a) {
    Car c1 = new Car();
    c1.model = "X";
    c1.year = 2022;
    c1.price = 900000;
    c1.display();
  }
}
