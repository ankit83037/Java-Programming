import java.util.*;
import java.sql.*;

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        // 	 int flightId = Integer.parseInt(sc.nextLine());
	       //  String source = sc.nextLine();
	       //  String destination = sc.nextLine();
	       //  int noOfSeats = Integer.parseInt(sc.nextLine());
	       //  double flightFare = Double.parseDouble(sc.nextLine());
	         
	       //  Flight flightObj = new Flight(flightId,source,destination,noOfSeats,flightFare);
	       
	       Flight flightObj = new Flight(32145,"CBE","VNS",250,10000.00);
	         
	         FlightManagementSystem fm = new FlightManagementSystem();
	         
	         System.out.println(fm.addFlight(flightObj)?
	                            "Flight details added successfully"
	                            :"Addition not done");
    }
}
