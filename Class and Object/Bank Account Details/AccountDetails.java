import java.util.*;
public class AccountDetails{
    
     public static Scanner sc = new Scanner(System.in);
    
    public static Account getAccountDetails(){
        
        System.out.println("Enter account id:");
        int id = Integer.parseInt(sc.nextLine());
        
        System.out.println("Enter account type:");
        String accountType = sc.nextLine();
        
        int balance=0;
        boolean validBalance = false;
        while(!validBalance){
            System.out.println("Enter balance");
            balance = sc.nextInt();
          if(balance<=0){
              System.out.println("Balance should be positive");
          }
          else{
              validBalance = !validBalance;
          }
        }
        
        Account ac = new Account();
        ac.setBalance(balance);
        ac.setAccountId(id);
        ac.setAccountType(accountType);

        return ac;
        
    }
    
    public static int getWithdrawAmount(){
        
        int amount=0;
        
        boolean isValidAmount = false;
        
        while(!isValidAmount){
            System.out.println("Enter amount to be withdrawn:");
            amount=sc.nextInt();
            if(amount<=0){
                System.out.println("Amount should be positive");
                
            }
            else{
                isValidAmount = !isValidAmount;
                
            }
        }
        return amount;
    }
    
    public static void main(String args[]){

        
        Account account = AccountDetails.getAccountDetails();

        int withdrawAmount = AccountDetails.getWithdrawAmount();
        boolean isWithdraw = account.withdraw(withdrawAmount);
    }
}
