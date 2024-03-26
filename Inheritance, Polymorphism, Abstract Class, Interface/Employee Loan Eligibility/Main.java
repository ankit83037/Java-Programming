import java.util.Scanner;
public class Main{
   
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        PermanentEmployee pe = new PermanentEmployee(101,"Harsh",10000.00);
        TemporaryEmployee te = new TemporaryEmployee(102,"Raman",9,300);
        
        Loan l = new Loan();
        
        System.out.println(l.calculateLoanAmount(pe));
        System.out.println(l.calculateLoanAmount(te));
    }
    
}
