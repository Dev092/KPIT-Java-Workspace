package Testing;

import company.dept.Departmentt;
import company.jdbc.ImplementJdbcCode;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementJdbcCode uy=new ImplementJdbcCode();
		
		Departmentt dept = new Departmentt();
		dept.setDeptNumber(1);
		dept.setDeptName("BVFRD");
		dept.setDeptLocation("Pune");
		
		uy.insert(dept);

	}

}
