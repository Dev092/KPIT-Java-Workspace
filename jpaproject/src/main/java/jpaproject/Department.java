package jpaproject;

import javax.persistence.*;


@Entity
@Table(name="MYDEPT120")
public class Department {
	@Id
	@Column(name="DEPTNO")
	int DepartmentNumber;
	
	@Column(name="DEPTNAME")
	int DepartmentName;
	@Column(name="LOC")
	int DepartmentLocation;
	
	int departmentnumber;
	String departmentname;
	String departmentlocation;
	
	
	public Department() {
		super();
		System.out.println("Department ctor....");
	}
	
	
	public int getDepartmentnumber() {
		return departmentnumber;
	}
	public void setDepartmentnumber(int departmentnumber) {
		this.departmentnumber = departmentnumber;
	}
	public String getDepartmentname() {
		return departmentname;
	}
	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}
	public String getDepartmentlocation() {
		return departmentlocation;
	}
	public void setDepartmentlocation(String departmentlocation) {
		this.departmentlocation = departmentlocation;
	}
	
	

}
