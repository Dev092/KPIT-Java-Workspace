package databaseconnect;
import java.sql.*;

public class connecttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("Drivare is registerd...");
			
			
			Connection conn = DriverManager.getConnection("jdbc:hsqldb:hsql//localhost/xdb","SA","");
			System.out.println("Connected to the db");
			
		}catch(Exception e) {
			
			e.printStackTrace();
			return;
		}
	}

}
