import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class TestKpitJdbc {
	public static void main(String[] args) {

	try {
		
		//for hsqldb
		DriverManager.registerDriver(new org.hsqldb.jdbc.JDBCDriver());
		
		//for myhsqldb
		Connection conn2 = DriverManager.getConnection("jdbc:hsqldb:hsql://localhost/xdb","SA","");
		System.out.println("Connected to the HSQL : "+conn2);
		
		
		
		
		System.out.println("Enter personId: ");
		Scanner sc1=new Scanner(System.in);
		int PERSONID=sc1.nextInt();
		
		System.out.println("Enter LASTNAME: ");
		Scanner sc2=new Scanner(System.in);
	    String LASTNAME=sc2.nextLine();
		
		System.out.println("Enter FirstName: ");
		Scanner sc3=new Scanner(System.in);
		String FIRSTNAME=sc3.nextLine();
		
		System.out.println("Enter City: ");
		Scanner sc4=new Scanner(System.in);
		String CITY=sc4.nextLine();
		
		
		PreparedStatement pst = conn2.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?)");
		pst.setInt(1, PERSONID); //fillup the first ? placeholder
		pst.setString(2, LASTNAME); //fill up the second ?
		pst.setString(3, FIRSTNAME); //fill up the third ?
		pst.setString(4, CITY);
		int rows = pst.executeUpdate();
		
		System.out.println("Rows inserted : "+rows);
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
		

}
}
