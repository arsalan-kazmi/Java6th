import java.util.*;

class Movie {
  String name, dir;
  int yr;
  double rate;

  void input() {
    Scanner sc = new Scanner(System.in);
    name = sc.next();
    dir = sc.next();
    yr = sc.nextInt();
    rate = sc.nextDouble();
  }

  void display() {
    System.out.println(name + " " + dir + " " + yr + " " + rate);
  }

  static void show(Movie[] m, double th) {
    for (Movie x : m)
      if (x.rate > th)
        x.display();
  }

  public static void main(String[] a) {
    Movie m1 = new Movie();
    m1.name = "M1";
    m1.dir = "D1";
    m1.yr = 2020;
    m1.rate = 4.5;
    m1.display();
  }
}
