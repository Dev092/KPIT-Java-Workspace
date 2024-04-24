package evceptionhandlingtest;

public class rocketlaunchtest {
	public static void main(String[] args) {
		
		
		
	}

}
class IgnitionException extends Exception{

	public IgnitionException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
class Rocket{
	
}
class ignition{
	int temperatire;
    boolean readyto;
	public ignition(int temperatire) {
		super();
		this.temperatire = temperatire;
	}

	@Override
	public String toString() {
		return "ignition [temperatire=" + temperatire + "]";
	}
	void ignitionready()
	{
		if(temperatire<100) {
			readyto=true;
		}
		else
		{
			readyto=false;
			IgnitionException e=new IgnitionException();
			
		}
	}
	
}
class gravity{
	float height;
    boolean gravitytest;
	public gravity(float height) {
		super();
		this.height = height;
	}
	void heightandgravity()
	{
		if(height<100) {
			gravitytest=true;
		}
		else
		{
			gravitytest=false;
		}
	}
	
}
class booster{
	int energy;
    boolean ready;
	public booster(int energy) {
		super();
		this.energy = energy;
	}
	void checkenergy() {
		if(energy>50) {
			ready=true;
		}
		else
		{
			ready=false;
		}
	}
}