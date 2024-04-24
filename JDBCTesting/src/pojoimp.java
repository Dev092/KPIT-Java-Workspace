import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import java.util.Scanner;
import java.sql.Connection;

public class pojoimp implements implementInterface{
	Connection conn=null;
	public pojoimp(){
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			System.out.println("Connection ok");
			}catch(SQLException e) {
				e.printStackTrace();
			}

	}
	
	
	@Override
	public void select() {
		try {

		Statement st = conn.createStatement();
		ResultSet rs=st.executeQuery("select*from KPIT");
		while(rs.next()) {
			System.out.println("ID is"+rs.getInt(1));
			System.out.println("Name is"+rs.getString(1));
			System.out.println("Branch is"+rs.getString(1));
		}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void insert() {
		
		try {
			System.out.println("Enter Id: ");
			Scanner sc1=new Scanner(System.in);
			int id=sc1.nextInt();
			
			System.out.println("Enter Name: ");
			Scanner sc2=new Scanner(System.in);
			String name=sc2.nextLine();
			
			System.out.println("Enter Branch: ");
			Scanner sc3=new Scanner(System.in);
		    String branch=sc3.nextLine();
			
			PreparedStatement pst = conn.prepareStatement("INSERT INTO KPIT VALUES (?,?,?)");
		    pst.setInt(1, id);
		    pst.setString(2, name);
		    pst.setString(3, branch);
		    
		    pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

	@Override
	public void update() {
		System.out.println("Enter Id: ");
		Scanner sc1=new Scanner(System.in);
		int id=sc1.nextInt();
		
		System.out.println("Enter Name: ");
		Scanner sc2=new Scanner(System.in);
		String name=sc1.nextLine();
		
		System.out.println("Enter Branch: ");
		Scanner sc3=new Scanner(System.in);
	    String branch=sc1.nextLine();
	    
		try {
			PreparedStatement pst = conn.prepareStatement("UPDATE KPIT SET namr=?,branch=? where id=?");
			
		    pst.setString(2, name);
		    pst.setString(1, branch);
		    pst.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    
	    
		
		
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void selectWhere() {
		// TODO Auto-generated method stub
		
	}
	
}
