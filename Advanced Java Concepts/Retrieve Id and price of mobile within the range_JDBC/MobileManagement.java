import java.util.*;
import java.sql.*;

public class MobileManagementSystem {
	
    public Map<Integer, Integer> viewMobileWithInTheRange(int minRange,int maxRange){
		
		// Fill your code here
		Map<Integer,Integer> mp = null;
		try{
		     mp = new LinkedHashMap<>();
		
		
		Connection conn = DB.getConnection();
		String query = "Select productId,price from mobile where price<=? && price>=? order by price";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setInt(1,maxRange);
		ps.setInt(2,minRange);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
		    int id = rs.getInt(1);
		    int price = rs.getInt(2);
		    mp.put(id,price);
		}
		
		
		}
		catch(Exception e){
		    System.out.println(e.getMessage());
		}
		return mp;
	}

}
