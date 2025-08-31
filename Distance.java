class Distance {
  int ft, in;

  double toMeters() {
    return ft * 0.3048 + in * 0.0254;
  }

  double toCm() {
    return toMeters() * 100;
  }

  static Distance add(Distance d1, Distance d2) {
    Distance d = new Distance();
    d.ft = d1.ft + d2.ft;
    d.in = d1.in + d2.in;
    return d;
  }

  public static void main(String[] a) {
    Distance d1 = new Distance();
    d1.ft = 5;
    d1.in = 6;
    System.out.println(d1.toMeters() + "m " + d1.toCm() + "cm");
  }
}
