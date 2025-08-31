import java.util.*;

class XorSwapDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    System.out.println("start " + a + " " + b);
    a ^= b;
    System.out.println("a^=b " + a + " " + b);
    b ^= a;
    System.out.println("b^=a " + a + " " + b);
    a ^= b;
    System.out.println("a^=b " + a + " " + b);
    System.out.println("end " + a + " " + b);
  }
}
