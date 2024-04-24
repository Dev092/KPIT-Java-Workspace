package cofeeMachine;

import Exceptions.ElectricityException;
import Exceptions.MilkException;
import Exceptions.WaterException;

public class Machine {
	public Machine() throws WaterException, MilkException, ElectricityException{
	int waterLevel=3;
	int milkLevel=4;
	boolean electricity=true;
	
	if(waterLevel>2) {
		System.out.println("WaterLevel is fine");
	}
	else {
		WaterException e=new WaterException("waterLevel is to low");
		throw e;
	}
	if(milkLevel>2) {
		System.out.println("milkLevel is fine");
	}
	else {
		MilkException e=new MilkException("milkLevel is to low");
		throw e;
	}
	if(electricity==true) {
		System.out.println("power is on");
	}
	else {
		ElectricityException e=new ElectricityException("Provide Electricity first");
		throw e;
	}
	}
	
	
}
