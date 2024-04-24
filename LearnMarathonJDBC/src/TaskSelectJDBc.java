import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import org.hsqldb.Statement;

public class TaskSelectJDBc {
	
	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
			
			Connection conn=DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
			
			
			Statement st = conn.createStatement();
			ResultSet rs=st.executeQuery("select*from STUDENT");
			while(rs.next()) {
				System.out.println("PERSONID : "+rs.getInt(1));
				System.out.println("LASTNAME  : "+rs.getString(2));
				System.out.println("FIRSTNAME    : "+rs.getString(3));
				System.out.println("CITY : "+rs.getString(4));
				System.out.println("---------------------");
				
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
