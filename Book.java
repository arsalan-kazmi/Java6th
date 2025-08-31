import java.util.*;

class Book {
  String title, author, pub;
  double price;

  void input() {
    Scanner sc = new Scanner(System.in);
    title = sc.next();
    author = sc.next();
    pub = sc.next();
    price = sc.nextDouble();
  }

  void display() {
    System.out.println(title + " " + author + " " + pub + " " + price);
  }

  static void search(Book[] b, String t) {
    for (Book x : b)
      if (x.title.equals(t))
        x.display();
  }

  public static void main(String[] a) {
    Book b1 = new Book();
    b1.title = "ABC";
    b1.author = "X";
    b1.pub = "P";
    b1.price = 200;
    b1.display();
  }
}
