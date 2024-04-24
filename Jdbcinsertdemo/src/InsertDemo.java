import java.sql.*;
import java.util.Scanner;

public class InsertDemo {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		    

		
			//To check connection
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			
			//To insert value
			PreparedStatement ps=conn2.prepareStatement("insert into MYDEPT120 values(7,'CSE','punjab')");
			
			
		
	}

	}


