import java.util.*;

interface TemperatureConverter {
  double cToF(double c);

  double fToC(double f);
}

class Converter implements TemperatureConverter {
  public double cToF(double c) {
    return (c * 9 / 5) + 32;
  }

  public double fToC(double f) {
    return (f - 32) * 5 / 9;
  }
}

public class TemperatureConversion {
  public static void main(String[] a) {
    Scanner sc = new Scanner(System.in);
    Converter c = new Converter();
    try {
      double v = Double.parseDouble(sc.next());
      System.out.println(c.cToF(v));
      System.out.println(c.fToC(v));
    } catch (NumberFormatException e) {
      System.out.println("Invalid");
    }
  }
}
