import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import pojo.car;
import repo.CarRepositery;
import org.junit.jupiter.api.Test;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:carsConfig.xml"})
public class CarRepositoryTesting {
	@Autowired
	CarRepositery carobj;
	@Test
	public void createCarTest() {
		//CarRepositery carRepo = ctx.getBean(CarRepositery.class);
		car carObj = new car();
		carObj.setCarNumber(102);
		carObj.setCarModelName("Audi");
		carObj.setCarPrice(600000);
		carRepo.createCar(carObj);
	}

}
