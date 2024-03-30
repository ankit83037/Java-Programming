
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		
		boolean isSearch = true;
		
		while(isSearch){
		    System.out.println("Enter the type of loan to be searched");
		    String loan = sc.nextLine();
		    
		    LoanManagementSystem lm = new LoanManagementSystem();
		    
		    int count = lm.viewLoanCountBasedOnType(loan);
		    
		    if(count>0){
		         System.out.println("Number of customers who have taken "+loan+" loan : "+count);
		    }
		    else{
		        System.out.println("No customer has acquired "+loan+" loan ");
		    }
		    
		    System.out.println("Do you want to searched again the loan type (yes/no)");
		    String input = sc.nextLine();
		    
		    if(input.equalsIgnoreCase("no")){
		        System.out.println("Thank you for using the application");
		        isSearch = false;
		    }
		}

		
	}
}
