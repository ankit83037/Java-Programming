import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//fill the code
		
		System.out.println("Enter the number of employees");
		int n = Integer.parseInt(sc.nextLine());
		
		List<Employee> empList = new ArrayList<>();
		System.out.println("Enter the employee details");
		
		for(int i=0;i<n;i++){
		    String empDetails = sc.nextLine();
		    String[] empDetail = empDetails.split("[:]");
		  //  System.out.println(empDetail[0]+empDetail[1]+" "+empDetail[2]);
		    Employee emp = new Employee(empDetail[0].trim(),
		                                empDetail[1].trim(),
		                               Double.parseDouble(empDetail[2]));
		    empList.add(emp);
		    
		}
		
		System.out.println("Enter the number of times salary limit to be searched");
		int times = Integer.parseInt(sc.nextLine());
		
		Management[] mList = new Management[times];
		
		try{
		    
		for(int i=0;i<times;i++){
		    System.out.println("Enter the salary limit to be searched");
		    int salary = Integer.parseInt(sc.nextLine());
		    Management m = new Management(salary,empList);
		    mList[i] = m;
		    m.start();
		  //  m.join();
		    
		}
		
		
		Thread.sleep(1000);
		for(Management m : mList){
		    System.out.println(m.getSalaryLimit()+" : "+m.getCount());
		}
		
		}
		catch(Exception e){
		    
		}
		
}
}
