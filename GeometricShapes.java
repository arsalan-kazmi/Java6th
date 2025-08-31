import java.util.*;

interface Shape {
  double area();

  double perimeter();
}

class Circle implements Shape {
  double r;

  Circle(double r) {
    this.r = r;
  }

  public double area() {
    return Math.PI * r * r;
  }

  public double perimeter() {
    return 2 * Math.PI * r;
  }
}

class Rectangle implements Shape {
  double l, b;

  Rectangle(double l, double b) {
    this.l = l;
    this.b = b;
  }

  public double area() {
    return l * b;
  }

  public double perimeter() {
    return 2 * (l + b);
  }
}

class Triangle implements Shape {
  double a, b, c;

  Triangle(double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public double area() {
    double s = (a + b + c) / 2;
    return Math.sqrt(s * (s - a) * (s - b) * (s - c));
  }

  public double perimeter() {
    return a + b + c;
  }
}

public class GeometricShapes {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try {
      Circle c = new Circle(sc.nextDouble());
      System.out.println(c.area() + " " + c.perimeter());
      Rectangle r = new Rectangle(sc.nextDouble(), sc.nextDouble());
      System.out.println(r.area() + " " + r.perimeter());
      Triangle t = new Triangle(sc.nextDouble(), sc.nextDouble(), sc.nextDouble());
      System.out.println(t.area() + " " + t.perimeter());
    } catch (Exception e) {
      System.out.println("Invalid input");
    }
  }
}
