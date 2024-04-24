package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class updatedatatest {

		// TODO Auto-generated method stub
		public static void main(String[] args) {

			try {
				
				DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
				System.out.println("HSQL Driver is registerd...");
				Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb", "SA", "");
				System.out.println("Connected to the HSQL : " + conn2);
				
				System.out.println("Enter which department number : ");
				Scanner scanner1 = new Scanner(System.in);
				int deptNumber=scanner1.nextInt();
				
				
				System.out.println("Enter which department location : ");
				Scanner scanner3 = new Scanner(System.in);
				String deptLoc=scanner3.nextLine();
				
				System.out.println("Enter which department name : ");
				Scanner scanner2 = new Scanner(System.in);
				String deptName=scanner2.nextLine();
				
				PreparedStatement pst = conn2.prepareStatement("UPDATE MYDEPT120 SET DEPTNO=?,LOC=? WHERE DEPTNAME=?");
				System.out.println("Prepared The statement");
				                pst.setInt(1, deptNumber); //fillup the first ? placeholder							
								pst.setString(2, deptLoc); //fill up the second ?
								pst.setString(3, deptName); //fill up the third ?

		
				int rows = pst.executeUpdate();
				System.out.println("Query executed...");
				System.out.println("Rows inserted : "+rows);
				
				pst.close();
				conn2.close();

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

