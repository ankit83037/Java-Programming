import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter no of bookings:");
        int bookings = input.nextInt();
        
        System.out.println("Enter the available tickets:");
        int availableTicket = input.nextInt();
        Ticket.setAvailableTickets(availableTicket);
        
        for(int i=0;i<bookings;i++){
            System.out.println("Enter the ticketid:");
            int ticketid = input.nextInt();
            
            System.out.println("Enter the price");
            int price = input.nextInt();
            
            System.out.println("Enter the no of tickets");
            int noOfTickets = input.nextInt();
            
            Ticket t = new Ticket();
            t.setPrice(price);
            
            System.out.println("Available tickets: "+ Ticket.getAvailableTickets() );
            System.out.println("Total amount:"+ t.calculateTicketCost(noOfTickets));
            System.out.println("Available ticket after booking: "+Ticket.getAvailableTickets());
        }
    }
}
