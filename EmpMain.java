abstract class Employee {
  abstract double calculateSalary();

  abstract void generatePayslip();
}

class FullTimeEmployee extends Employee {
  double calculateSalary() {
    return 50000;
  }

  void generatePayslip() {
    System.out.println("FT Salary:" + calculateSalary());
  }
}

class PartTimeEmployee extends Employee {
  double calculateSalary() {
    return 20000;
  }

  void generatePayslip() {
    System.out.println("PT Salary:" + calculateSalary());
  }
}

class Intern extends Employee {
  double calculateSalary() {
    return 5000;
  }

  void generatePayslip() {
    System.out.println("Intern Salary:" + calculateSalary());
  }
}

public class EmpMain {
  public static void main(String[] a) {
    Employee e = new FullTimeEmployee();
    e.generatePayslip();
    e = new PartTimeEmployee();
    e.generatePayslip();
    e = new Intern();
    e.generatePayslip();
  }
}
