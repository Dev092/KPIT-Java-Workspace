import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class EmployeTesting {
	EntityManager manager;
	EmployeTesting(){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
		manager =factory.createEntityManager();
		System.out.println("Manager created"+ manager);
	}
	
	@Test
	public void createEmployeTest() {
		System.out.println("Trying to insert an Employe");
		
	}

}
