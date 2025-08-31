class Employee {
  int id;
  String name;
  double basic;

  double hra() {
    return 0.1 * basic;
  }

  double da() {
    return 0.05 * basic;
  }

  double gross() {
    return basic + hra() + da();
  }

  void display() {
    System.out.println(id + " " + name + " " + basic + " " + hra() + " " + da() + " " + gross());
  }

  public static void main(String[] a) {
    Employee e = new Employee();
    e.id = 1;
    e.name = "Ram";
    e.basic = 10000;
    e.display();
  }
}
