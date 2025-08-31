class Book {
  String title, author;
  double price;

  Book() {
    title = "Default";
    author = "Unknown";
    price = 0;
  }

  Book(String t, String a) {
    title = t;
    author = a;
    price = 0;
  }

  Book(String t, String a, double p) {
    title = t;
    author = a;
    price = p;
  }

  void display() {
    System.out.println(title + " " + author + " " + price);
  }

  public static void main(String[] args) {
    new Book().display();
    new Book("Book1", "Author1").display();
    new Book("Book2", "Author2", 250).display();
  }
}
