package dao;
import java.util.List;

import entity.Department;

public interface DepartmentDao {
	void createDepartment(DepartmentDao deptObj);
	DepartmentDao readDepartment(int deptNumber);
	List<DepartmentDao> readDepartments();
	void updateDepartment(DepartmentDao deptObj);
	void deleteDepartment(int deptNumber);
	int getDepartmentNumber();
	String getDepartmentLocation();
	String getDepartmentName();
	void setDepartmentNumber(int int1);
	void setDepartmentLocation(String string);
	void setDepartmentName(String string);
	
	
	

}
