package repo;
import java.util.List;
import pojo.car;



public interface CarRepositery {
		void createCar(car car);
		void updateCar(car car);
		void deleteCar(int carid);
		car  readCar(int id);
		List<car> readCars();
	}
	
	


