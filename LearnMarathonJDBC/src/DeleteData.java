import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class DeleteData {
	
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			Scanner sc=new Scanner(System.in);
			int PERSONID=sc.nextInt();
			
			
			//Statement st=conn.createStatement();
			PreparedStatement pst = conn.prepareStatement("DELETE FROM STUDENT WHERE PERSONID=?");
			pst.setInt(1,PERSONID);
			int row=pst.executeUpdate();
			System.out.println("Deleted"+row);
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
