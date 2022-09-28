package dao;
 
import java.sql.Connection;
import java.sql.DriverManager;
 
public class Database
{
public Connection getConnection() throws Exception
{
try
{
String connectionURL = "jdbc:mysql://localhost:3306/rakeshkumar_sql";
Connection connection = null;
Class.forName ("com.mysql.jdbc.Driver").newInstance ();
String userName = "root";
String password = "root";
connection = DriverManager.getConnection (connectionURL, userName, password);
return connection;
} catch (Exception e)
{
throw e;
}
 
}
 
}