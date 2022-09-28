package mysqlcon;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class mysqljava {

	public static void main(String[] args) throws SQLException  {
		// TODO Auto-generated method stub
		try
		{
		
		//Class.forName ("com.MySQL.jdbc.Driver").newInstance ();
        String userName = "root";
        String password = "root";
        String url = "jdbc:MySQL://localhost:3306/rakeshkumar_sql";        
        Connection conn = DriverManager.getConnection (url, userName, password);
        System.out.println ("\nDatabase Connection Established...");
		}
		catch (Exception ex)
        {
		       System.err.println ("Cannot connect to database server");
			   ex.printStackTrace();
        } 
	}
}
