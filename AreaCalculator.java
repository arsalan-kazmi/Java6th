import java.util.*;

class AreaCalculator {
  int area(int s) {
    return s * s;
  }

  int area(int l, int b) {
    return l * b;
  }

  double area(double r) {
    return Math.PI * r * r;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    AreaCalculator a = new AreaCalculator();
    System.out.println("Square:" + a.area(sc.nextInt()));
    System.out.println("Rectangle:" + a.area(sc.nextInt(), sc.nextInt()));
    System.out.println("Circle:" + a.area(sc.nextDouble()));
    sc.close();
  }
}
