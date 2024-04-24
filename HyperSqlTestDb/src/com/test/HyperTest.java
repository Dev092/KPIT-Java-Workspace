package com.test;
import java.util.*;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HyperTest {
	public static void main(String[] args) {

		try {
			
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Driver is registerd...");
			Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
			System.out.println("Connected to the HSQL : " + conn2);

			//Statement st = conn2.createStatement();
			// Pune - sc.next()
			// new York -> 
			
	
			System.out.println("Enter new department number : ");
			Scanner scanner1 = new Scanner(System.in);
			int deptNumber=scanner1.nextInt();
			
			
			System.out.println("Enter new department location : ");
			Scanner scanner2 = new Scanner(System.in);
			String deptLoc=scanner2.nextLine();
			
			System.out.println("Enter new department name : ");
			Scanner scanner3 = new Scanner(System.in);
			String deptName=scanner3.nextLine();
			
			PreparedStatement pst = conn2.prepareStatement("INSERT INTO MYDEPT120 VALUES (?,?,?)");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptNumber); //fillup the first ? placeholder
			pst.setString(2, deptLoc); //fill up the second ?
			pst.setString(3, deptName); //fill up the third ?
	
			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows inserted : "+rows);
			
			pst.close();
			conn2.close();
			
			
//			while (rs.next()) {
//				System.out.println("DEPTNO : " + rs.getInt(1));
//				System.out.println("DNAME  : " + rs.getString(2));
//				System.out.println("LOC    : " + rs.getString(3));
//				System.out.println("---------------------");
//
//			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
