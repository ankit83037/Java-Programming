import java.util.Scanner;
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// fill your code here
		System.out.println("Enter the minimum range");
		int minRange = sc.nextInt();
		
		System.out.println("Enter the maximum range");
		int maxRange = sc.nextInt();
		
		MobileManagementSystem ms = new MobileManagementSystem();
		Map<Integer,Integer> mp = ms.viewMobileWithInTheRange(minRange,maxRange);
		
		if(mp.size()!=0){
		    
		for(Map.Entry e : mp.entrySet()){
		    System.out.println(e.getKey()+":"+e.getValue());
		}
		}
		else{
		    System.out.println("No mobiles found for the given range");
		}

		
	}
}
