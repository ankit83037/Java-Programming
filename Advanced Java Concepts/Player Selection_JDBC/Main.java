import java.util.*;

public class Main {
	public static void main(String[] args) {
	
		// fill your code here
		try{
		    Scanner sc = new Scanner(System.in);
		    
		System.out.println("Enter the minimum height");
		double height = Double.parseDouble(sc.nextLine());    
		
		System.out.println("Enter the maximum weight");
		double weight = Double.parseDouble(sc.nextLine());
		
		PlayerSelectionSystem ps = new PlayerSelectionSystem();
		List<String> playersList = ps.playersBasedOnHeightWeight(height,weight);
		
		if(playersList.size()>0){
		    playersList.stream().forEach(System.out::println);
		}else{
		    System.out.println("No players are with minimum height of " + height +" and maximum weight of "+weight);
		}
		
		}
		catch(Exception e){
		    System.out.println(e.getMessage());
		}
		
		

		
	}
}
