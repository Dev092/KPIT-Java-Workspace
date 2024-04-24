package Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmpTable")
public class EmployeTablePojo {
	
	@Id
	@Column(name="EmpNo")
	private int EmployeNumber;
	
	@Id
	@Column(name="EmpName")
	private String EmployeName;
	
	@Id
	@Column(name="EmpSalary")
	private int EmployeSalary;

	public EmployeTablePojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployeNumber() {
		return EmployeNumber;
	}

	public void setEmployeNumber(int employeNumber) {
		EmployeNumber = employeNumber;
	}

	public String getEmployeName() {
		return EmployeName;
	}

	public void setEmployeName(String employeName) {
		EmployeName = employeName;
	}

	public int getEmployeSalary() {
		return EmployeSalary;
	}

	public void setEmployeSalary(int employeSalary) {
		EmployeSalary = employeSalary;
	}

}
