import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Entity.Employee;

public class EmployeeTesting {
	EntityManager manager;
	EmployeeTesting(){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
		manager=factory.createEntityManager();
		System.out.println("Manager is created"+manager);
		
	}
	
	
	//to insert the data
//	@Test
//	public void createEmployeeTest() {
//		System.out.println("Trying to insert an Employee");
//        EntityTransaction trans=manager.getTransaction();
//        trans.begin();
//           Employee emp=new Employee();
//           emp.setEmployeeName("Devi");
//           emp.setEmployeeNumber(204);
//           emp.setEmployeeSalary(20000);
//           manager.persist(emp);
//        trans.commit();
//        System.out.println("Data is Entered");
//        
//	}
	
	//to find data where
//	@Test
//	public void selectEmployeeTest() {
//		System.out.println("Trying to search an Employee");
//           Employee emp=manager.find(Employee.class, 203);
//           Assertions.assertTrue(emp!=null);
//           System.out.println("EMPNO : "+emp.getEmployeeNumber());
//           System.out.println("EMPNAME : "+emp.getEmployeeName());
//           System.out.println("EMPSAL : "+emp.getEmployeeSalary());
//
//        System.out.println("Data is Entered");
//        
//	}
	
//	@Test
//	public void selectAllEmployeeTest() {
//		System.out.println("Trying to insert an Employee");
//           Query query=manager.createQuery("from Employee");
//           Assertions.assertTrue(query!=null);
//           List<Employee>staff=query.getResultList();
//           for(Employee emp:staff) {
//           System.out.println("EMPNO : "+emp.getEmployeeNumber());
//           System.out.println("EMPNAME : "+emp.getEmployeeName());
//           System.out.println("EMPSAL : "+emp.getEmployeeSalary());
//           }
//        System.out.println("Data is Entered");
//        
//	}
	
//	@Test
//	public void updateEmployeeTest() {
//		System.out.println("Trying to update an Employee");
//        EntityTransaction trans=manager.getTransaction();
//        trans.begin();
//           Employee emp=manager.find(Employee.class,203);
//           Assertions.assertTrue(emp!=null);
//           emp.setEmployeeName("Divya");
//           emp.setEmployeeSalary(20500);
//           manager.merge(emp);
//        trans.commit();
//        System.out.println("Data is Entered");
//        
//	}
	
	
	@Test
	public void deleteEmployeeTest() {
		System.out.println("Trying to update an Employee");
        EntityTransaction trans=manager.getTransaction();
        trans.begin();
           Employee emp=manager.find(Employee.class,204);
           Assertions.assertTrue(emp!=null);
           manager.remove(emp);
        trans.commit();
        System.out.println("Data is deleted");
        
	}

}
