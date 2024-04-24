package LaunchPad;

import ExceptionsInLaunching.BoosterException;
import ExceptionsInLaunching.GravityException;
import ExceptionsInLaunching.PowerException;

public class Rocket {
	int height=800;
	int boosterPower=500;
	boolean power=true;
	public int kmcomplete;
	
	public Rocket()throws BoosterException,GravityException,PowerException{
		System.out.println("Checking the rocket");
		if(height>500) {
			System.out.println("Gravity is ok");
		}else {
			GravityException ge= new GravityException("Gravity is not working");
			throw ge;
		}
		
		System.out.println("Checking Booster power");
		if(boosterPower>200) {
			System.out.println("boosterPower is ok");
		}else {
			BoosterException be= new BoosterException("Booster is not working");
			throw be;
		}
		
		System.out.println("Checking Power");
		if(power==true) {
			System.out.println("power is ok");
		}else {
			PowerException pe= new PowerException("Booster is not working");
			throw pe;
		}
		System.out.println("Ready to go");
	}
	
	public void gaganYan() throws PowerException,GravityException,BoosterException {
		for(int i=1;i<=30;i++) {
			System.out.println("km completed: "+i);
			
			double val=Math.random()%10;
			if(val>0.98) {
				PowerException exc=new PowerException("Need more Power to start");
				throw exc;
			}
			if(height>500) {
				GravityException ge=new GravityException("Gravity not working");
			}
			
			
			kmcomplete=i;
			
		}
		System.out.println("JOURNEY OVER.....");
	}

}
