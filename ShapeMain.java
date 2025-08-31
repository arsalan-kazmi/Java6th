abstract class Shape {
  abstract double area();
}

class Circle extends Shape {
  double r;

  Circle(double r) {
    this.r = r;
  }

  double area() {
    return 3.14 * r * r;
  }
}

class Rectangle extends Shape {
  double l, w;

  Rectangle(double l, double w) {
    this.l = l;
    this.w = w;
  }

  double area() {
    return l * w;
  }
}

class Triangle extends Shape {
  double b, h;

  Triangle(double b, double h) {
    this.b = b;
    this.h = h;
  }

  double area() {
    return 0.5 * b * h;
  }
}

public class ShapeMain {
  public static void main(String[] a) {
    Shape s = new Circle(5);
    System.out.println(s.area());
    s = new Rectangle(2, 3);
    System.out.println(s.area());
    s = new Triangle(3, 4);
    System.out.println(s.area());
  }
}
