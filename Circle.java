import java.util.*;

class Circle {
  double r;

  double area() {
    return Math.PI * r * r;
  }

  double circ() {
    return 2 * Math.PI * r;
  }

  public static void main(String[] a) {
    Circle c = new Circle();
    c.r = 5;
    System.out.println(c.area() + " " + c.circ());
  }
}
