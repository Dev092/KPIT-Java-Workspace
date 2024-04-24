import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Employe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		Connection con = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/", "SA", "");
		System.out.println("Connected");
		PreparedStatement ps=con.prepareStatement("INSERT INTO EMPLOYE VALUES(1,'DEV','SE',200,90)");
		}catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
