package oopsproject;

public class Exceptionhangling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       

}
class SpeedLimitExceededException extends RuntimeException {
	SpeedLimitExceededException(String msg){
		super(msg);
	}
}
class TrafficException extends RuntimeException {
	
}
class PUCException extends Exception {
	public PUCException(String msg) {
		super(msg);
	}
}
class CoolantException extends Exception {

	public CoolantException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class car{
	boolean pucStatus; //false
	boolean coolantStatus; //false
	void checkpuc() {
		double v=Math.random()%2;
		if(v>0.90) {
			pucStatus=true;
		}
		else {
			pucStatus=false;
		}
	}
	void checkCoolant() {
		for(int i=1;i<10;i++) {
			double val = Math.random()%10; // 0 to 1
		    if(val>0.90) {
		    	coolantStatus =true;
				break;
			}
			else if(val<0.75) {
				//System.out.println("Coolant need to be refilled");
				coolantStatus = false;
				break;
			}
		    
		}
	}
	void longDrive() throws CoolantException ,PUCException
	{
		for (int i = 1; i <= 30; i++) {
			System.out.println("Km completed..."+i);
			//Random random = new Random();
			//int val = random.nextInt(120)+1;
			//System.out.println("val "+val);
			double val = Math.random()%10; // 0 to 1
			//System.out.println("val "+val);
			
			if(val > 0.90) {
				SpeedLimitExceededException ex = new SpeedLimitExceededException("Speed limit exceeded..it was supposed to be upto 80 : current speed was "+val);
				throw ex;
			}
			
		}
		System.out.println("JOURNEY OVER.....");
	}
}