
public class FinalKeywordTest {
	public static void main(String[] args) {
		final student sref=new student("Dev",203,78);
		final int x;
		System.out.println(sref.name);
		sref.name="Basu";
		
		System.out.println(sref.name);
	}

}
class student{
	String name;
    int roll;
	int marks;
	public student(String name, int roll, int marks) {
		super();
		this.name = name;
		this.roll = roll;
		this.marks = marks;
	}
	
	
}