import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import com.kpit.pojo.Car;
import com.kpit.repo.CarRepository;

import com.kpit.pojo.*;
import com.kpit.repo.*;
import org.junit.jupiter.api.Test;
@SpringBootTest
public class CarRepositoryTesting {
	
	@Autowired
	CarRepository carRepo;
	
	@Autowired
	Car carObj;
	
	@Test
	public void createCarTest() {
		//CarRepositery carRepo = ctx.getBean(CarRepositery.class);
		
		carObj.setCarNumber(106);
		carObj.setCarName("BMW");
		carObj.setCarPrice(600000);
		carRepo.save(carObj);
	}

}
