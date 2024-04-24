package TestTheExceptions;

import Device.Mobile;
import ExceptionForCall.BalanceException;
import ExceptionForCall.RechargeException;

public class TestTheExceptions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		 
		try {
			Mobile m11=new Mobile();
		} catch (BalanceException | RechargeException e) {
			// TODO Auto-generated catch block
			throw e;
		}

	}
	
}
