import java.sql.*;

public class LoanManagementSystem {

	public int  viewLoanCountBasedOnType (String loanType){
		int count=-1;
	    try{
	        
		
		// Fill your code here
		Connection conn = DB.getConnection();
		String query = "Select count(*) from loan where loanType=?";
		PreparedStatement ps = conn.prepareStatement(query);
		ps.setString(1,loanType);
		
		ResultSet rs= ps.executeQuery();
		
		while(rs.next()){
		count = rs.getInt(1);
		}
		
	    }catch(Exception e){
	        System.out.printf(e.getMessage());
	    }
		
		return count;
	}
}
