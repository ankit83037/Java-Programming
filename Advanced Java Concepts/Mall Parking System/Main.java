import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
public class Main {

public static void main(String [] args) {
   
        //Fill the Code
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        
        String systemDate = "29/10/2019 20:10";
        System.out.println("In-time");
        String inTime = sc.nextLine();
        String outTime = "";
        
        String ldoArr[] = {};
        String ldiArr[] = {};
        
        LocalDateTime ldi = null;
        LocalDateTime ldo = null;
        LocalDateTime lds = LocalDateTime.parse(systemDate,df);
        
        
        try{
            
             ldi = LocalDateTime.parse(inTime,df);
            
            if(lds.compareTo(ldi)>0){
                
                 ldiArr = inTime.split("[/\\s:]");
            }
            else 
              throw new Exception();
        }
        catch(Exception e){
            System.out.println(inTime+" is an Invalid In-Time");
            System.exit(0);
        }
            
                System.out.println("Out-time");
        try{
               outTime = sc.nextLine();
                 ldo = LocalDateTime.parse(outTime,df);
                //  ldoArr[] = outTime.split("[/\\s:]");
                
                if(ldo.compareTo(ldi)>0){
                     ldoArr = outTime.split("[/\\s:]");
                }else
                   throw new Exception();
        }
        catch(Exception e){
               System.out.println(outTime+" is an Invalid Out-Time");
               System.exit(0);
        }
                
                    
                    int days = Integer.parseInt(ldoArr[0].trim())-Integer.parseInt(ldiArr[0].trim());
                    int month = Integer.parseInt(ldoArr[1].trim())-Integer.parseInt(ldiArr[1].trim());
                    int years = Integer.parseInt(ldoArr[2].trim())-Integer.parseInt(ldiArr[2].trim());
                    int hours = Integer.parseInt(ldoArr[3].trim())-Integer.parseInt(ldiArr[3].trim());
                    int minutes = Integer.parseInt(ldoArr[4].trim())-Integer.parseInt(ldiArr[4].trim());
                    if(minutes >0){
                        minutes = 1;
                    }
                    else 
                        minutes = 0;
                    
                    long totalHours = years*12*30*24+month*30*24+days*24+(hours)+minutes;
                    long charge = totalHours*10;
                    System.out.println(charge+" Rupees");
                    
                    // long hrs = ldi.until(ldo, ChronoUnit.HOURS);
                    // long fee = hrs*10 + 10L;
                    // System.out.println(fee+" Rupees");
        }
}
