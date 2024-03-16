public class Ticket{
    private int ticketid;
    private int price;
    private static int availableTickets;
    
    public int getTicketid(){
        return ticketid;
    }
    
    public int getPrice(){
        return price;
    }
    
    public static int getAvailableTickets(){
        return availableTickets;
    }
    
    public void setTicketid(int ticketid){
        this.ticketid = ticketid;
    }
    
    public void setPrice(int price){
        if(price>0){
         this.price = price;    
        }
        
    }
    
    public static void setAvailableTickets(int availTickets){
        if(availTickets>0){
            availableTickets = availTickets;
        }
        
    }
    
    public int calculateTicketCost(int noOfTickets){
        int ticketCost = -1;
        if(availableTickets - noOfTickets>=0){
            availableTickets-= noOfTickets;
            ticketCost = noOfTickets*price;
            return ticketCost;
        }
        return ticketCost;
    }
    
    
}
