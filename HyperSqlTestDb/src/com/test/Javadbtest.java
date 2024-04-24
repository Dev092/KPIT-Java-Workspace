package com.test;

import java.sql.*;


public class Javadbtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
			
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			Statement st= conn2.createStatement();
			
			
}
catch (SQLException e) {
	e.printStackTrace();
}
	}

}
