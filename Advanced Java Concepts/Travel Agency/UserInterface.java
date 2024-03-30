import java.util.*;

public class UserInterface {
    
    public static CommissionInfo generateCommissionObtained (){
        CommissionInfo comInfo = (ticketObj) ->{
            double commission = 0.0;
            String classType = ticketObj.getClassType().toLowerCase();
            if(classType.equals("sl") || classType.equals("2s")){
                commission = 60;
            }else{
                commission = 100;
            }
            return commission;
        };
        return comInfo;
    }
    
   public static void main(String args[]) {
        
    // Fill the code here
    Scanner sc = new Scanner(System.in);
    List<Ticket> ticketList = new ArrayList<>();
    
    System.out.println("Enter the no of passengers");
    int noOfPassenger = Integer.parseInt(sc.nextLine());
    
    double commission = 0.0;
    
    for(int i=1;i<=noOfPassenger;i++){
        System.out.println("Details of Passenger "+i+":");
        
        System.out.println("Enter the pnr no:");
        long pnr = Long.parseLong(sc.nextLine());
        
        System.out.println("Enter passenger name:");
        String name = sc.nextLine();
        
        System.out.println("Enter seat no:");
        int seat = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter class type:");
        String classType = sc.nextLine();
        
        System.out.println("Enter ticket fare:");
        double fare = Double.parseDouble(sc.nextLine());
        
        Ticket ticket  = new Ticket(pnr,name,seat,classType,fare);
        ticketList.add(ticket);
        
        CommissionInfo comInfo = generateCommissionObtained();
        commission+= comInfo.calculateCommissionAmount(ticket);
        
    }
    
    System.out.println("Commission Obtained");
    System.out.printf("Commission obtained per each person: Rs.%.2f",commission);
    
    
    }
    
}
