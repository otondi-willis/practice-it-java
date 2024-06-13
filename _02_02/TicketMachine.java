package _02_02;

public class TicketMachine {

  public static void main(String[] args) {
    Ticket ticket = new Ticket();
    ticket.setDestination("New York");
    ticket.setPrice(15.30);
    ticket.setIsReturn(true);

    System.out.println(ticket.getDestination());
    System.out.println(ticket.getPrice());
    System.out.println(ticket.getIsReturn());

  }

}
