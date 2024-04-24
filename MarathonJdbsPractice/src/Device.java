import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hsqldb.Statement;



public class Device {
	
	public static void main(String[] args) {
		
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection is established");
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
