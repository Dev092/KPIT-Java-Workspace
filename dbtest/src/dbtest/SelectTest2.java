package dbtest;

import java.sql.*;

public class SelectTest2 {
	public static void main(String[] args) {

		//1. load the driver (ctrl+shift+M)
		
		try {
			//for mysql
//			DriverManager.registerDriver("jdbc:hsqldb:file:/opt/db/xdb","SA,"");
//			System.out.println("MySQL Driver is registerd...");
//			
			//for hsqldb
			DriverManager.registerDriver("jdbc:hsqldb:file:/opt/db/xdb","SA","");
			System.out.println("HSQL Driver is registerd...");
			
//			//for mysql
//			Connection conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","root123");
//			System.out.println("Connected to the MYSQL : "+conn1);
//			
			//for myhsqldb
			Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected to the HSQL : "+conn2);
			
			Statement st = conn2.createStatement();
			//ur table is mydept
			ResultSet rs = st.executeQuery("select * from dept10");		
			
			while(rs.next()) {
				System.out.println("DEPTNO : "+rs.getInt(1));
				System.out.println("DNAME  : "+rs.getString(2));
				System.out.println("LOC    : "+rs.getString(3));
				System.out.println("---------------------");
				
			}
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


