package company.dept;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Department implements Operations{
	Connection conn=null;
	public Department() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public void insert() {
		try {
			System.out.println("Enter the deptNo.: ");
			Scanner sc=new Scanner(System.in);
			int deptNo=sc.nextInt();
			
			System.out.println("Enter the deptName: ");
			Scanner sc1=new Scanner(System.in);
			String deptName=sc1.nextLine();
			
			System.out.println("Enter the Location: ");
			Scanner sc2=new Scanner(System.in);
			String location=sc1.nextLine();
			
			
			PreparedStatement pst=conn.prepareStatement("INSERT INTO DEPT_MASTER VALUES(?,?,?)");
			pst.setInt(1,deptNo);
			pst.setString(2,deptName);
			pst.setString(3,location);

			
			pst.executeUpdate();
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
			
	}
	@Override
	public void select() {
		// TODO Auto-generated method stub
try {
			
			System.out.println("Enter the DeptNo: ");
			Scanner ssc=new Scanner(System.in);
			int deptNo=ssc.nextInt();
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
	@Override
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
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Enter the deptNo:");
		Scanner sc1=new Scanner(System.in);
		int deptNo=sc1.nextInt();
		
		System.out.println("Enter the deptName:");
		Scanner sc2=new Scanner(System.in);
		String deptName=sc2.nextLine();
		
		System.out.println("Enter the deptLocation:");
		Scanner sc3=new Scanner(System.in);
		String location=sc3.nextLine();
		
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("UPDATE TABLE DEPT_MASTER SET ");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Enter the DeptNo: ");
		Scanner sc=new Scanner(System.in);
		int deptNo=sc.nextInt();
		PreparedStatement pst;
		try {
			pst = conn.prepareStatement("DELETE FROM DEPT_MASTER WHERE DEPTNUMBER=?");
			pst.setInt(1,deptNo);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

	

}
