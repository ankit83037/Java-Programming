
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class TrainManagementSystem {
	
	public ArrayList <Train> viewTrain (String coachType, String source, String destination) throws SQLException,ClassNotFoundException{
		
		// Fill your code here	
		ArrayList<Train> trainList = new ArrayList<>();
		Connection conn = DB.getConnection();
		
		String query = "select * from train where ("+ coachType +" >0) and (source=? and destination=?) order by train_number";
		
		PreparedStatement st = conn.prepareStatement(query);
		
// 		st.setString(1,coachType);
		st.setString(1,source);
		st.setString(2,destination);
		
		ResultSet rs = st.executeQuery();
		
		
// 		System.out.println(rs.getInt(1));
		while(rs.next()){
		    Train t = new Train(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),
		    rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9));
		  //  t.setTrainNumber();
		  //  t.setTrainName(rs.getString(2));
		    
		    trainList.add(t);
		  //  System.out.println(trainList.size());
		}
		
		conn.close();
		
		return trainList;
		
	}

}
