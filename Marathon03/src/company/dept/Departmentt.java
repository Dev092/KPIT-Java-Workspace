package company.dept;

public class Departmentt {
	int deptNumber;
	String deptName;
	String deptLocation;
	
	
	
	public int getDeptNumber() {
		return deptNumber;
	}



	public void setDeptNumber(int deptNumber) {
		this.deptNumber = deptNumber;
	}



	public String getDeptName() {
		return deptName;
	}



	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}



	public String getDeptLocation() {
		return deptLocation;
	}



	public void setDeptLocation(String deptLocation) {
		this.deptLocation = deptLocation;
	}



	@Override
	public String toString() {
		return "Departmentt [deptNumber=" + deptNumber + ", deptName=" + deptName + ", deptLocation=" + deptLocation
				+ "]";
	}

	
	

}
