import java.sql.*;
public class FlightManagementSystem{
    
    public  boolean addFlight(Flight flightObj){
        boolean rs = false;
        try{
        Connection con = DB.getConnection();
        
        String query = "Insert into flight values(?,?,?,?,?)";
        
        PreparedStatement st = con.prepareStatement(query);
        st.setInt(1,flightObj.getFlightId());
        st.setString(2,flightObj.getSource());
        st.setString(3,flightObj.getDestination());
        st.setInt(4,flightObj.getNoOfSeats());
        st.setDouble(5,flightObj.getFlightFare());
        
        st.execute();
        con.close();
        
        rs = true;
        
        // Thread.sleep(1000);
        
        // System.out.println("after con close");
        
        // return true;
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return rs;
    }
}
