import java.util.*;

class Student {
  int roll;
  String name, course;
  int m1, m2, m3;

  void accept() {
    Scanner sc = new Scanner(System.in);
    roll = sc.nextInt();
    name = sc.next();
    course = sc.next();
    m1 = sc.nextInt();
    m2 = sc.nextInt();
    m3 = sc.nextInt();
  }

  int total() {
    return m1 + m2 + m3;
  }

  double avg() {
    return total() / 3.0;
  }

  void display() {
    System.out.println(roll + " " + name + " " + course + " " + total() + " " + avg());
  }

  public static void main(String[] a) {
    Student s = new Student();
    s.accept();
    s.display();
  }
}
