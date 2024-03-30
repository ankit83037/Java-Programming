import java.util.stream.Stream;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeUtility {

	public Employee[] getEmployeeDetails(String[] details) {

		//Fill your code here
		int n = details.length;
		Employee[] empDetails = new Employee[n];
		
		for(int i=0;i<n;i++){
		    String detail[] = details[i].split("[;]");
		    Employee e = new Employee();
		    e.setEmpId(detail[0].trim());
		    e.setEmpName(detail[1].trim());
		    e.setSalary(Double.parseDouble(detail[2].trim()));
		    empDetails[i] = e;
		}

        return empDetails;

	}

	public Stream<Employee> getStreamOfEmployee(Employee[] empDetails) {

		//Fill your code here
        List<Employee> list = Arrays.asList(empDetails);
        return list.stream();

	}

	public String[] shortlistedEmployee(Stream<Employee> empStream,double minSalary) {

		//Fill your code here

        String[] shortlistedEmployee = empStream.filter(emp->emp.getSalary()>=minSalary)
                                                .map(emp->emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getSalary())
                                                .sorted()
                                                .toArray(n->new String[n]);
                                                
            return shortlistedEmployee;



	}

}
