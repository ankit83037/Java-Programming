import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	
	private static Map<String,Double> employeeMap = new HashMap<>();

	public Map<String, Double> getEmployeeMap() {
		return employeeMap;
	}

	public void setEmployeeMap(Map<String, Double> employeeMap) {
		this.employeeMap = employeeMap;
	}
	
	public void addEmployeeDetails(String employeeName, double salary)
	{
		// Fill the code
		employeeMap.put(employeeName,salary);
	}
	
	
	
	public static EmployeeAudit findEmployee()
	{
// 		ArrayList<String> name=null;
		// Fill the code
		EmployeeAudit empAudit = salary->{
		    ArrayList<String> name = new ArrayList<>();
		    for(Map.Entry<String,Double> e : employeeMap.entrySet()){
		        if(e.getValue()<= salary){
		            name.add(e.getKey());
		        }
		    }
		    return name;
		};
		return empAudit;
	}
	
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		
		// Fill the code
			boolean takeDetail = true;
// 			Main main = new Main();
// 			main.setEmployeeMap(new HashMap<>());
	while(takeDetail){
	    System.out.println("1.Add Employee Details");
	    System.out.println("2.Find Employee Details");
	    System.out.println("3.Exit");
	    System.out.println("Enter the choice");
	    int choice = Integer.parseInt(sc.nextLine());
	    
	    switch(choice){
	        case 1:
	            System.out.println("Enter the Employee name");
	            String empName = sc.nextLine();
	            
	            System.out.println("Enter the Employee Salary");
	            Double empSalary = Double.parseDouble(sc.nextLine());
	            
                Main main = new Main();
                // main.setEmployeeMap(new HashMap<>());
	            main.addEmployeeDetails(empName,empSalary);
	            
	            break;
	            
	       case 2:
	           System.out.println("Enter the salary to be searched");
	           double searchSalary = Double.parseDouble(sc.nextLine());
	           
	           EmployeeAudit empAudit = findEmployee();
	           ArrayList<String> empList = empAudit.fetchEmployeeDetails(searchSalary);
	           if(empList.isEmpty()){
	               System.out.println("No Employee Found");
	           }
	           else{
	               System.out.println("Employee List");
	               for(String name: empList){
	                   System.out.println(name);
	               }
	           }
	           break;
	           
	       case 3:
	           System.out.println("Let's complete the session");
	           takeDetail = false;
	           
	    }
	}
	}

}
