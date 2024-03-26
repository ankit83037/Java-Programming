import java.util.*;

public class Division{
    
    public String divideTwoNumbers(int number1,int number2){
        String res = "" ;
        try{
            
        // if(number2==0){
        //     throw new ArithmeticException();
        // }
            int ans = number1/number2;
            res = "The answer is "+ans+". ";
        }catch(ArithmeticException e){
            res = "Division by zero is not possible. ";
        }
        finally{
            res =  res+"Thanks for using the application.";
        }
        
       return res;
    }
    
    public static void main (String[] args) {
        String message = "";
            
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        
         String ans = new Division().divideTwoNumbers(n1,n2);
        
        System.out.println(ans);
    }
}
