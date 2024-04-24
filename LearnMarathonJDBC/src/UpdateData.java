import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			System.out.println("Id which want to delete");
			Scanner sc=new Scanner(System.in);
			int PERSONID=sc.nextInt();
			
			System.out.println("New last name");
			Scanner sc1=new Scanner(System.in);
		    String LASTNAME=sc1.nextLine();
		    
		    System.out.println("New First name");
			Scanner sc3=new Scanner(System.in);
		    String FIRSTNAME=sc3.nextLine();
		    
		    System.out.println("New City");
			Scanner sc4=new Scanner(System.in);
		    String CITY=sc4.nextLine();
			
			
			Statement st=conn.createStatement();
			PreparedStatement pst = conn.prepareStatement("UPDATE STUDENT SET LASTNAME=?,FIRSTNAME=?,CITY=? WHERE PERSONID=?");
			pst.setString(1,LASTNAME);
			pst.setString(2,FIRSTNAME);
			pst.setString(3,CITY);
			pst.setInt(4,PERSONID);
			int row=pst.executeUpdate();
			System.out.println("updated"+row);
			
			
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
