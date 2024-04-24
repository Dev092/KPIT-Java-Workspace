package Attendance;

import CompanyKpit.KpitCom;
import Exceptions.FoodException;
import Exceptions.IdCardException;
import Exceptions.LaptopException;

public class Monday {
	public static void main(String[] args) throws FoodException, IdCardException, LaptopException {
		KpitCom day;
		try {
	day=new KpitCom();
	}catch(FoodException e1) {
		throw e1;
	}
	catch(IdCardException ex) {
		throw ex;
	}

	catch(LaptopException ex) {
		throw ex;
	}
	
         try {
        	 day.checkingLunch();
         }catch(FoodException e) {
        	 throw e;
         }

	}
}
