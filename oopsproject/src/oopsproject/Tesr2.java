package oopsproject;
class pen01{
	String color;
	String type;
	
	public void write()
	{
		System.out.println("Writing Something.."+color+type);
	} 
	
	
}
class student{
	student(int x)
	{
		System.out.println("Dev"+x);
	}
}
public class Tesr2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        pen01 pen1=new pen01();
        pen1.color="Red";
        pen1.type="ball";
        pen1.write();
        student s1=new student(76);
        
	}

}
