package cofeeLate;

import Exceptions.ElectricityException;
import Exceptions.MilkException;
import Exceptions.WaterException;
import cofeeMachine.Machine;

public class PrepareCofee {
	public static void main(String[] args) {
		Machine machineRef=null;
		
		
			try {
				machineRef=new Machine();
			} catch (WaterException | ElectricityException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	catch(MilkException e) {
			e.printStackTrace();
		}
			
			
	}

}
