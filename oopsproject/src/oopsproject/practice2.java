package oopsproject;

public class practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doctor docref=new doctor();
		surgeon surref=new surgeon();
		heartsurgeon hsurref=new heartsurgeon();
        docref.diagnose();
        hsurref.dosurgery();
	}

}

class operationthreator{
	static void doingOpenHeartSurgery(heartsurgeon hs) {
		System.out.println("OT is having an open heart surgery..."+hs.getClass());
		hs.diagnose();
	}
}
class medicalcamp{
	static void medicalcheckup(doctor decref)
	{
		System.out.println("Doing medical checkup..");
	}
	
}
class doctor{
	void diagnose() {
		System.out.println("Doctor:diagnose()");
	}
}
class surgeon extends doctor{
	void diagnose() {
		System.out.println("Surgeon:diagnose()");
	}
	private void cut() {
		System.out.println("cutting...");
	}
	private void stitching() {
		System.out.println("stitching....");
	}
	void dosurgery() {
		System.out.println("doing Surgery...");	
	}
}
class heartsurgeon extends surgeon{
	void diagnose() {
		System.out.println("HeartSurgeon:diagnose()");
	}
	void dosurgery() {
		System.out.println("doing heart surgery..");
	}
	void checkecg() {
		System.out.println("checking ecg");
	}
}
