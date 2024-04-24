import java.sql.*;
import java.sql.DriverManager;

import org.hsqldb.jdbc.JDBCDriver;

public class ConnectionCheck {
	public static void main(String[] args) {
		
	try {
	DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
	Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
	System.out.println("Connection is established");
	}catch(SQLException e) {
		e.printStackTrace();
	}
	}

}
