class Transport {
  void bookTicket() {
    System.out.println("Booking transport");
  }
}

class Bus extends Transport {
  void bookTicket() {
    System.out.println("Bus booked");
  }
}

class Train extends Transport {
  void bookTicket() {
    System.out.println("Train booked");
  }
}

class Flight extends Transport {
  void bookTicket() {
    System.out.println("Flight booked");
  }
}

public class TransportMain {
  static void book(Transport t) {
    t.bookTicket();
  }

  public static void main(String[] a) {
    book(new Bus());
    book(new Train());
    book(new Flight());
  }
}
