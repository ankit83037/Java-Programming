import java.util.*;
public class IncrementCalculation{
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary");
        int salary = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter the Performance appraisal rating");
        float appraisal = Float.parseFloat(sc.nextLine());
        
        double increment = 0;
        
        if(salary<=0 || appraisal<1 || appraisal>5){
            System.out.println("Invalid Input");
            return;
        }
        else if(appraisal>=1 && appraisal<=3){
            increment = 0.1*salary;
        }
        else if(appraisal>=3.1 && appraisal<=4){
            increment = 0.25*salary;
        }
        else if(appraisal>=4.1 && appraisal<=5){
            increment = 0.30*salary;
        }
        
        System.out.printf("%.0f",(salary+increment));
        
    }
}
