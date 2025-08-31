class Calculator {
  int calculate(int a) {
    return a * a;
  }

  int calculate(int a, int b) {
    return a * b;
  }

  float calculate(float x) {
    return x * x * x;
  }

  public static void main(String[] args) {
    Calculator c = new Calculator();
    System.out.println(c.calculate(5));
    System.out.println(c.calculate(3, 4));
    System.out.println(c.calculate(2.5f));
  }
}
