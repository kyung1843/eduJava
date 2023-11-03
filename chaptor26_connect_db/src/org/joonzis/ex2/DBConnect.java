package org.joonzis.ex2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
//1.
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		
		
		
			 Class.forName("oracle.jdbc.driver.OracleDriver");
			 
			  String user = "scott";
			  String password = "tiger";
			  String url = "jdbc:oracle:thin:@LOCALhost:1521:xe";  
			  
			  Connection conn = DriverManager.getConnection(url, user, password);
			  return conn;
			  //return DriverManager.getConnection(url, user, password);  간락햐게 줄여서 가능
			  
			  
	}
	
	
}
