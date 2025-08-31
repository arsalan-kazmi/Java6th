import java.util.*;

class Item {
  int code, qty;
  String name;
  double price;

  void input() {
    Scanner sc = new Scanner(System.in);
    code = sc.nextInt();
    name = sc.next();
    qty = sc.nextInt();
    price = sc.nextDouble();
  }

  double total() {
    return qty * price;
  }

  void bill() {
    System.out.println(code + " " + name + " " + qty + " " + price + " " + total());
  }

  public static void main(String[] a) {
    Item i = new Item();
    i.code = 1;
    i.name = "Pen";
    i.qty = 10;
    i.price = 5;
    i.bill();
  }
}
