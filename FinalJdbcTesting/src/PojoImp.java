import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PojoImp implements Funcinility{
	Connection conn=null;
	public PojoImp() {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void insert() {
		try {
		System.out.println("Enter the Id: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		
		System.out.println("Enter the Name: ");
		Scanner sc1=new Scanner(System.in);
		String name=sc1.nextLine();
		
		PreparedStatement pst=conn.prepareStatement("INSERT INTO MEMBER VALUES(?,?)");
		pst.setInt(1,id);
		pst.setString(2,name);
		
		pst.executeUpdate();
		
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void selectAll() {
		try {
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("SELECT*FROM MEMBER");
			while(rs.next()) {
				System.out.println("ID is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));

				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void selectOne() {
		
		try {
			
			System.out.println("Enter the Id: ");
			Scanner isc=new Scanner(System.in);
			int ID=isc.nextInt();
			Statement st=conn.createStatement();
			ResultSet rs=st.executeQuery("select * from "+ "MEMBER where ID="+"'"+ID+"'");
			while(rs.next()) {
				System.out.println("ID is "+rs.getInt(1));
				System.out.println("Name is "+rs.getString(2));

				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

	@Override
	public void delete() {
		try {
			System.out.println("Enter the DeptNo: ");
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		PreparedStatement pst=conn.prepareStatement("DELETE FROM MEMBER WHERE id=?");
		pst.setInt(1, id);
		pst.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void update() {
		try {
			System.out.println("Enter id:");
			Scanner sc=new Scanner(System.in);
			int ID=sc.nextInt();
			System.out.println("Enter Name:");

			Scanner sc1=new Scanner(System.in);
			String NAME=sc1.nextLine();
			
			PreparedStatement pst=conn.prepareStatement("UPDATE MEMBER SET NAME=? WHERE ID=?");
			pst.setString(1,NAME);
			pst.setInt(2, ID);
			
			pst.executeUpdate();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			
		}
	
		

	
	

}
