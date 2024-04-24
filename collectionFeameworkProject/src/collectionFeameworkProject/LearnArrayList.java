package collectionFeameworkProject;

import java.util.ArrayList;

public class LearnArrayList {
	public static void main(String[] args) {
	ArrayList<String> studentName=new ArrayList<>();
	studentName.add("Ram");
	studentName.add("Dev");
	System.out.println(studentName);
	
	studentName.add(2,"Sayam");
	System.out.println(studentName);
	
	System.out.println(studentName.get(2));
	
	
	studentName.remove(1);
	System.out.println(studentName);
	
	studentName.set(0, "Radha");
	System.out.println(studentName);

	
	
	
	
	}

}
