import java.util.*;

class BitwiseOperationsDemo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(), b = sc.nextInt();
    System.out.println("a " + Integer.toBinaryString(a));
    System.out.println("b " + Integer.toBinaryString(b));
    System.out.println("a&b " + Integer.toBinaryString(a & b));
    System.out.println("a|b " + Integer.toBinaryString(a | b));
    System.out.println("a^b " + Integer.toBinaryString(a ^ b));
    System.out.println("~a " + Integer.toBinaryString(~a));
    System.out.println("~b " + Integer.toBinaryString(~b));
    System.out.println("a<<1 " + Integer.toBinaryString(a << 1));
    System.out.println("b<<1 " + Integer.toBinaryString(b << 1));
    System.out.println("a>>1 " + Integer.toBinaryString(a >> 1));
    System.out.println("b>>1 " + Integer.toBinaryString(b >> 1));
  }
}
