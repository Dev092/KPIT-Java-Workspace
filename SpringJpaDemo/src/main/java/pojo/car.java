package pojo;
import javax.persistence.Column;
import javax.persistence.Id;



public class car {
	@Id //primary key
	@Column(name="car_id") // column's name
	private int carNumber;
	
	@Column(name="car_model")
	private String carModelName;
	
	@Column(name="car_price")
	private float carPrice;
	
	public car() {
		super();
		System.out.println("Car() ctor..."+this.hashCode());
	}

	public int getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}

	public String getCarModelName() {
		return carModelName;
	}

	public void setCarModelName(String carModelName) {
		this.carModelName = carModelName;
	}

	public float getCarPrice() {
		return carPrice;
	}

	public void setCarPrice(float carPrice) {
		this.carPrice = carPrice;
	}
	
	
	
	

}


