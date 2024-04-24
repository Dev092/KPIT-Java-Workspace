package CheckForTalk;

import Exceptions.BatteryException;
import Exceptions.ContactNumber;
import Exceptions.RechargeException;
import MobilePhone.SamsungPhone;

public class MakeCall {
	public static void main(String[] args) {
		SamsungPhone m11=null;
		
		
			try {
				m11=new SamsungPhone();
			} catch (BatteryException | ContactNumber e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		catch(RechargeException e) {
			e.printStackTrace();
		}
	}

}
