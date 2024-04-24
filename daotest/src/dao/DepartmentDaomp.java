package dao;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import entity.Department;

public class DepartmentDaomp implements DepartmentDao {
	Connection conn2 ;

	DepartmentDaomp() {
		System.out.println("DepartmentDAOImpl() ctor....");
		try {
			
			//for hsqldb
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			System.out.println("HSQL Driver is registerd...");
			
			
			//for myhsqldb
			conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/mydb","SA","");
			System.out.println("Connected to the HSQL : "+conn2);
			
			
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	
	
	
	@Override
	public void createDepartment(DepartmentDao deptObj) {

		try {
			PreparedStatement pst = conn2.prepareStatement("INSERT INTO DEPT10 VALUES (?,?,?)");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptObj.getDepartmentNumber()); //fillup the first ? placeholder
			pst.setString(2, deptObj.getDepartmentLocation()); //fill up the second ?
			pst.setString(3, deptObj.getDepartmentName()); //fill up the third ?

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows inserted : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

	@Override
	public DepartmentDao readDepartment(int deptNumber) {
		DepartmentDao deptObj = null;
		 
		try {
			Statement st = conn2.createStatement();
			//ur table is mydept
			ResultSet rs = st.executeQuery("select * from dept10 where deptno="+deptNumber);		
			
			if(rs.next()) {
				deptObj = new DepartmentDao(); //new object per loop cycle
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentLocation(rs.getString(2));
				deptObj.setDepartmentName(rs.getString(3));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptObj;
	}

	@Override
	public List<DepartmentDao> readDepartments() {

		List<DepartmentDao> deptList = new ArrayList<DepartmentDao>();
		 
		try {
			Statement st = conn2.createStatement();
			//ur table is mydept
			ResultSet rs = st.executeQuery("select * from dept10");		
			
			while(rs.next()) {
				DepartmentDao deptObj = new DepartmentDao(); //new object per loop cycle
				deptObj.setDepartmentNumber(rs.getInt(1));
				deptObj.setDepartmentLocation(rs.getString(2));
				deptObj.setDepartmentName(rs.getString(3));
				deptList.add(deptObj); //add the object to the list
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return deptList;
	}

	@Override
	public void updateDepartment(DepartmentDao deptObj) {
		
		try {
			PreparedStatement pst = conn2.prepareStatement("UPDATE DEPT10 SET LOC=?, DNAME=? WHERE DEPTNO=?");
			System.out.println("Prepared The statement");
			pst.setString(1, deptObj.getDepartmentLocation()); //fill up the second ?
			pst.setString(2, deptObj.getDepartmentName()); //fill up the third ?
			pst.setInt(3, deptObj.getDepartmentNumber()); //fillup the first ? placeholder

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows UPDATED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void deleteDepartment(int deptNumber) {

		try {
			PreparedStatement pst = conn2.prepareStatement("DELETE FROM DEPT10 WHERE DEPTNO=?");
			System.out.println("Prepared The statement");
			pst.setInt(1, deptNumber); //fillup the first ? placeholder

			int rows = pst.executeUpdate();
			System.out.println("Query executed...");
			System.out.println("Rows DELETED : "+rows);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}



	@Override
	public int getDepartmentNumber() {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public String getDepartmentLocation() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public String getDepartmentName() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setDepartmentNumber(int int1) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setDepartmentLocation(String string) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void setDepartmentName(String string) {
		// TODO Auto-generated method stub
		
	}
	

}
