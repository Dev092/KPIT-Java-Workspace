package entity;

import javax.persistence.Entity;
import javax.persistence.*;
import javax.persistence.Table;

@Entity
@Table(name="emp_tbl")
public class EmployeKpit {
	EmployeKpit(){
		super();
	}
	@Id
	@Column(name="empno")
	private int employenumber;
	
	@Column(name="empname")
	private String employename;
	
	@Column(name="empsal")
	private int employesalary;

	public EmployeKpit() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getEmployenumber() {
		return employenumber;
	}

	public void setEmployenumber(int employenumber) {
		this.employenumber = employenumber;
	}

	public String getEmployename() {
		return employename;
	}

	public void setEmployename(String employename) {
		this.employename = employename;
	}

	public int getEmployesalary() {
		return employesalary;
	}

	public void setEmployesalary(int employesalary) {
		this.employesalary = employesalary;
	}
	
	

}
