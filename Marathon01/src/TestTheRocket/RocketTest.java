package TestTheRocket;

import rocket.station.RocketLauncher;
import rocket.station.exceptions.BoostException;
import rocket.station.exceptions.LaunchException;

public class RocketTest {
	public static void main(String[] args) throws BoostException, LaunchException {
		
		//System.out.println("Get set go");
		double boost=Math.random()%10;
		//System.out.println(boost);
		if(boost<0.90) {
			RocketLauncher rocRef=new RocketLauncher();
			System.out.println("Booster is fine");
			rocRef.launch();
		}
		else {
			BoostException e=new BoostException("It has Booster Exception");
			throw e;
		}
		RocketLauncher lref=new RocketLauncher();
		
	 
		
	}

}
