package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/java")
public class mysqlconnector {
	@GET
	@Path("/mysqlcon")
    @Produces(MediaType.TEXT_PLAIN)
    public String sayJsonHello() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException {
		Class.forName ("com.mysql.jdbc.Driver").newInstance ();
		String userName = "root";
	    String password = "root";
	    String url = "jdbc:mysql://localhost:3306/rakeshkumar_sql";        
	    @SuppressWarnings("unused")
		Connection connection = DriverManager.getConnection (url, userName, password);
	    return "\nDatabase Connection Established...";
    }

}
