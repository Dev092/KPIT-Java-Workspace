package repo;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import pojo.car;
public abstract class carRepositeryImpl implements CarRepositery {
EntityManager em;
	
	public carRepositeryImpl() {
		//META-INF/persistence.xml
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("MyJPA");
		System.out.println("EMF :"+factory);
		em = factory.createEntityManager();
		System.out.println("EM :"+em);
		System.out.println("CarRepositoryImpl() ctor....");
	}
	
	public void createCar(car car) {
		// TODO Auto-generated method stub
		System.out.println("createCar(Car)...trying to persist...");
		EntityTransaction trans = em.getTransaction();
		trans.begin();
		em.persist(car);
		trans.commit();
	}

	public void updateCar(car car) {
		// TODO Auto-generated method stub

	}

	public void deleteCar(int carid) {
		// TODO Auto-generated method stub

	}

	public car readCar(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<car> readCars() {
		// TODO Auto-generated method stub
		return null;
	}
		
		
	}
	
	


