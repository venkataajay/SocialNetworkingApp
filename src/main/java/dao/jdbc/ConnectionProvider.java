package dao.jdbc;
import java.sql.*;  
  
public class ConnectionProvider {  
private static Connection con=null;  
static{  
try{  
//Class.forName(DRIVER);  
//con=DriverManager.getConnection(CONNECTION_URL,USERNAME,PASSWORD);  
	DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","ajay","1234");
}catch(Exception e){}  
}  
  
public static Connection getCon(){  
    return con;  
}  
  
}  