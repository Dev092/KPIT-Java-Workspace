package rocket.station;
import rocket.station.exceptions.BoostException;
import rocket.station.exceptions.LaunchException;

public class RocketLauncher {

	public void launch() throws LaunchException{
		RocketLauncher rocketRef=null;
		RocketLauncher l1=null;
		try {
			int i=0;
			while(true) {
				System.out.println("Iterator: "+i);
				i++;
			double launch=Math.random()%10;
			if(launch>0.30) {
			}
			else {
				LaunchException e=new LaunchException("It has Launch Exception");
				throw e;
			}
			if(i==20)
				break;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
			
		}
		
		
	}


