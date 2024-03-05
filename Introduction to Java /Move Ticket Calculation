import java.util.*;
public class CinemaTicket{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of ticket:");
        
        int n = Integer.parseInt(sc.nextLine());
        
        if(n>=5 && n<=40){
            System.out.println("Do you want refreshment:");
            String refreshment = sc.next();
            
            System.out.println("Do you have coupon code:");
            String coupon = sc.next();
            
            System.out.println("Enter the circle:");
            String circle = sc.next();
            
            int ticket = 0;
            double discount = 0.0;
            int refresh = 0;
            double totalCost = 0;
            
            if(circle.equals("k")){
                ticket = 75;
            }else if(circle.equals("q")){
                ticket = 150;
            }else{
                System.out.println("Invalid Input");
                return ;
            }
            
             totalCost = n*ticket;
            //  System.out.println("totalCost"+totalCost);
             
            if(n>20){
                totalCost = totalCost - 0.1*totalCost;
            }
            if(coupon.equals("y")){
                totalCost = totalCost -0.02*totalCost;
            }
            if(refreshment.equals("y")){
                refresh = 50;
            }
            // System.out.println("discount"+discount);
            // System.out.println("refresh"+n*refresh);
            double total = totalCost + n*refresh;
            System.out.printf("Ticket cost:%.2f",total);
        }else{
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
    }
}
