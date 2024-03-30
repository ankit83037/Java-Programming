import java.util.*;

public class Main {
	public static void main(String[] args) {
	    
	    try{
		Scanner sc = new Scanner(System.in);
		// fill your code here
		
		System.out.println("Enter the source");
		String source =sc.nextLine();
		
		System.out.println("Enter the destination");
		String dest = sc.nextLine();
		
		System.out.println("Enter the coach type");
		String coach = sc.nextLine().toLowerCase();
		
		boolean isValid = coach.matches("^[a][c][1-3]") || coach.equals("sleeper") || coach.equals("seater");
		
		List<Train> trainList = new ArrayList<>();
		if(isValid){
		    TrainManagementSystem tms = new TrainManagementSystem();
		    trainList = tms.viewTrain(coach,source,dest);
		    
		    if(trainList.size()>0){
		        for(Train t:trainList){
		            System.out.println(t.getTrainNumber()+" "+t.getTrainName());
		        }
		        
		    }else{
		        System.out.println("No trains found");
		    }
		}else{
		    System.out.println("Invalid Coach Type");
		}

	    }
	    catch(Exception e){
	        System.out.println(e.getMessage());
	    }
	}
}
