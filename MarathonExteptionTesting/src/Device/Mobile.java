package Device;

import ExceptionForCall.BalanceException;
import ExceptionForCall.RechargeException;

public class Mobile {
	
	public Mobile() throws BalanceException, RechargeException {
	
	int batery=40;
	int recharge=80;
	
	if(batery>10) {
		System.out.println("Chargeing is ok");
	}
	else {
		BalanceException e=new BalanceException("Batery is low");
		throw e;
	}
	
	if(recharge>10) {
		System.out.println("recharge is ok");
	}
	else {
		RechargeException e=new RechargeException("Not recharged");
		throw e;
	}
	
	
	}

}
