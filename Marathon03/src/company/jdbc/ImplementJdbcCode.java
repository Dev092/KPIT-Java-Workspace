package company.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import company.dept.Departmentt;

public class ImplementJdbcCode {
	Connection conn=null;
	public ImplementJdbcCode() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		
		
		
}
	
	public void insert(Departmentt dept) {
		try {
	 
			PreparedStatement pst=conn.prepareStatement("INSERT INTO DEPT_MASTER VALUES(?,?,?)");
			pst.setInt(1,dept.getDeptNumber());
			pst.setString(2,dept.getDeptName());
			pst.setString(3,dept.getDeptLocation());
			pst.executeUpdate();
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			
	}

	public void select() {
		// TODO Auto-generated method stub
try {
			
	Departmentt d1=new Departmentt();
			int deptNo=d1.getDeptNumber();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from "+ "DEPT_MASTER where DEPTNUMBER="+"'"+deptNo+"'");
			while(rs.next()) {
				System.out.println("DeptNO is "+rs.getInt(1));
				System.out.println("DeptName is "+rs.getString(2));
				System.out.println("Location is "+rs.getString(3));

				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	public void selectAll() {
		// TODO Auto-generated method stub
		
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("SELECT*FROM DEPT_MASTER");
			while(rs.next()) {
				System.out.println("DeptNo is "+rs.getInt(1));
				System.out.println("DeptName is "+rs.getString(2));
				System.out.println("Location is "+rs.getString(3));

				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void update(Departmentt dept) {
		// TODO Auto-generated method stub
		
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("UPDATE TABLE DEPT_MASTER SET ");
			pst.setInt(1,dept.getDeptNumber());
			pst.setString(2,dept.getDeptName());
			pst.setString(3,dept.getDeptLocation());
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public void delete(Departmentt dept) {
		// TODO Auto-generated method stub
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("DELETE FROM DEPT_MASTER WHERE DEPTNUMBER=?");
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}	

}
