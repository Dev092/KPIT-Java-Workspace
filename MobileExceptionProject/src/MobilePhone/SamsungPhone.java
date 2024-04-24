package MobilePhone;

import Exceptions.BatteryException;
import Exceptions.ContactNumber;
import Exceptions.RechargeException;

public class SamsungPhone {
	public SamsungPhone() throws BatteryException, ContactNumber, RechargeException {
		float battery=50;
		boolean contactNo=true;
		boolean recharge=true;
		
		if(battery>10.0f) {
			System.out.println("Battery is sufficient");
		}
		else {
			BatteryException e=new BatteryException("Battery is low");
			throw e;
		}
		
		if(contactNo==true) {
			System.out.println("Contact number is founded");
		}
		else {
			ContactNumber e=new ContactNumber("Contact number not found");
			throw e;
		}
		
		if(recharge==true) {
			System.out.println("You have sufficient recharge");
		}
		else {
			RechargeException e=new RechargeException("Battery is low");
			throw e;
		}
		
		
		
		
		
	}

}
