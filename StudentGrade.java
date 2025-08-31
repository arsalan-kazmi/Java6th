import java.util.*;

interface Grading {
  void calculateGrade();
}

class Student implements Grading {
  int m;

  Student(int m) {
    this.m = m;
  }

  public void calculateGrade() {
    if (m >= 90)
      System.out.println("A");
    else if (m >= 75)
      System.out.println("B");
    else if (m >= 50)
      System.out.println("C");
    else
      System.out.println("F");
  }
}

public class StudentGrade {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    try {
      new Student(sc.nextInt()).calculateGrade();
    } catch (InputMismatchException e) {
      System.out.println("Invalid");
    }
  }
}
