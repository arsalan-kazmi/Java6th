class EvenOddBitwise {
  public static void main(String[] args) {
    int n = new java.util.Scanner(System.in).nextInt();
    System.out.println((n & 1) == 0 ? "Even" : "Odd");
  }
}
