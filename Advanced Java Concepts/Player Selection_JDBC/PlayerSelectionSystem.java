import java.util.List;
import java.util.ArrayList;
import java.sql.*;

public class PlayerSelectionSystem {

	public List<String> playersBasedOnHeightWeight (double minHeight, double maxWeight) throws SQLException,ClassNotFoundException{
		
		// Fill your code here	
		List<String> playersList = new ArrayList<>();
		Connection conn = DB.getConnection();
		
		String query = "select playerName from player where height >= ? and weight <= ? order by playerName";
		PreparedStatement ps = conn.prepareStatement(query);
		
		ps.setDouble(1,minHeight);
		ps.setDouble(2,maxWeight);
		
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()){
		    playersList.add(rs.getString(1));
		}
		
		return playersList;
	}
}
