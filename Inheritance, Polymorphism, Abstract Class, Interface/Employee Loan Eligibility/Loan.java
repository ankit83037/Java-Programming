
public class Loan {
	
	//Implement the below method 
	
	public double calculateLoanAmount(Employee employeeObj) {
	    double loanAmount = 0.0;
		if(employeeObj instanceof PermanentEmployee){
		    employeeObj.calculateSalary();
		    loanAmount = 0.15*employeeObj.getSalary();
		}
		else{
		    employeeObj.calculateSalary();
		    loanAmount = 0.10*employeeObj.getSalary();
		}
		return loanAmount;
	}

}
