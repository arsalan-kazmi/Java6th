class Rectangle {
  double l, w;

  double area() {
    return l * w;
  }

  double peri() {
    return 2 * (l + w);
  }

  public static void main(String[] a) {
    Rectangle r = new Rectangle();
    r.l = 5;
    r.w = 3;
    System.out.println(r.area() + " " + r.peri());
  }
}
