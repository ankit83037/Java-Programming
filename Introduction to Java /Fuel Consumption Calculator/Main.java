import java.util.*;

class Main{
    public static void main(String args[]){
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the no of liters to fill the tank");
        int qty = input.nextInt();
        
        if(qty <=0){
            System.out.printf("%d is an Invalid Input",qty);
            return ;
            
        }
        
        System.out.println("Enter the distance covered");
        int dist = input.nextInt();
        
        if(dist <=0){
             System.out.printf("%d is an Invalid Input",dist);
             return;
        }
        
            double consumption1 = (double)((double)(qty)/(double)dist)*100;
            double consumption2 = (double)(dist*0.6214)/(qty*0.2642);
            System.out.println("Liters/100KM");
            System.out.printf("%.2f",consumption1);
            System.out.println();
            System.out.println("Miles/gallons");
            System.out.printf("%.2f",consumption2);
        
        
        
        
    }
}
