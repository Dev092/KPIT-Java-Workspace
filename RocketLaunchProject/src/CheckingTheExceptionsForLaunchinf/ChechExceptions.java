package CheckingTheExceptionsForLaunchinf;

import ExceptionsInLaunching.BoosterException;
import ExceptionsInLaunching.GravityException;
import ExceptionsInLaunching.PowerException;
import LaunchPad.Rocket;

public class ChechExceptions {
	public static void main(String[] args) {
	Rocket roc=null;
	
	
		try {
			roc=new Rocket();
		} catch (GravityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (PowerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	catch(BoosterException e) {
		e.printStackTrace();
	}
		
		
			if(roc!=null) {
				
					try {
						roc.gaganYan();
					} catch (GravityException | BoosterException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				
				catch(PowerException e) {
					System.out.println(e.getMessage());
					
				}
				
			
			}
		}

}

