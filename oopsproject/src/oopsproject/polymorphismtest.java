package oopsproject;

public class polymorphismtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doctor d1=new heartsurgeon();
		d1.diagnose();
           
	}

}

class doctor1{
	void diagnose() {
		System.out.println("Doctor diadnoseing");
	}
	
}
class surgeon1 extends doctor{
	void diagnose() {
		System.out.println("Surgeon diadnoseing");
	}
	
}
class heartsurgeon extends doctor{
	void diagnosed() {
		System.out.println("HeartSurgeon diadnoseing");
	}
	
}
