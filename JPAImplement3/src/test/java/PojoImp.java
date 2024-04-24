import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PojoImp {
	
	EntityManager manager;
	PojoImp(){
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("MyJPA");
		manager=factory.createEntityManager();
		System.out.println("Created manager"+manager);
	}
	

		@Test
	public void test() {
			System.out.println("Trying to insert");
	        EntityTransaction trans=manager.getTransaction();
	        trans.begin();
	          SchoolPojo emp=new SchoolPojo();
	          emp.setId(48);
	          emp.setName("Sayam");
	          emp.setSclass(9);
	          manager.persist(emp);
	        trans.commit();
	}
		
		@Test
		public void selectTest() {
				System.out.println("Trying to finding");
				SchoolPojo  emp=manager.find(SchoolPojo.class,45);
				Assertions.assertTrue(emp!=null);
				System.out.println("Id is: "+emp.getId());
				
				System.out.println("Name is: "+emp.getName());
		}
		
		@Test
		public void selectAllTest() {
				System.out.println("Trying to finding all employe");
				Query query=manager.createQuery("from SchoolPojo");
				Assertions.assertTrue(query!=null);
				List<SchoolPojo>staff=query.getResultList();
				for(SchoolPojo emp:staff) {
				System.out.println("Id is: "+emp.getId());
				
				System.out.println("Name is: "+emp.getName());
				}
		}
		
		@Test
		public void updateData() {
			System.out.println("Trying to update");
	        EntityTransaction trans=manager.getTransaction();
	        trans.begin();
	          SchoolPojo emp=manager.find(SchoolPojo.class, 48);
	          Assertions.assertTrue(emp!=null);
	          emp.setName("Rani");
	          emp.setSclass(6);
	          manager.persist(emp);
	        trans.commit();
	}
		
		
		@Test
		public void deleteData() {
			System.out.println("Trying to data");
	        EntityTransaction trans=manager.getTransaction();
	        trans.begin();
	          SchoolPojo emp=manager.find(SchoolPojo.class, 45);
	          Assertions.assertTrue(emp!=null);
	          
	          manager.remove(emp);
	        trans.commit();
	}
		

}
