import java.util.Scanner;
import java.util.stream.Stream;
import java.util.*;

public class Main {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		//Fill your code here
		System.out.println("Enter all roll numbers separated by comma");;
		String rollNumbers = sc.nextLine();
		
		System.out.println("Enter the department name acronym");
		String dept = sc.nextLine();
		
		int count = getCount(getRollNumbers(rollNumbers),dept);
		System.out.println(count>0 ? "Number of students in "+dept+" is "+count
		                           : "No students from "+dept);


	}

	public static Stream<String> getRollNumbers(String rollNumbers) {
		//Fill your code here
		
		String[] rollNo = rollNumbers.split(",");
		
		return Arrays.stream(rollNo);


	}

	public static int getCount(Stream<String> rollNumberStream, String dept) {
		//Fill your code here
		
		int count = (int)rollNumberStream.map(rollno->rollno.toLowerCase())
		                            .filter(rollno->rollno.startsWith(dept.toLowerCase()))
		                            .count();
		                            
		                            return count;

	}

}
