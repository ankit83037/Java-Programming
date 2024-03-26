import java.util.*;
public class Main{
    
    public static void main(String args[]){
        Customer customer = new Customer(1,"Harsh","harsh@gmail.com");
        Account savingAccount = new SavingsAccount(1453245671,customer,5000,1000);
        
        System.out.println(savingAccount.withdraw(2000));
    }
}
