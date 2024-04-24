package collectionFeameworkProject;

import java.util.Iterator;
import java.util.TreeSet;

public class CollectionXyz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Teacher>t1=new TreeSet<>();
		t1.add(new Teacher("Ram",56));
		Iterator<Teacher>it=t1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
class Teacher implements Comparable<Teacher>{
	String name;
	int age;
	public Teacher(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Teacher other) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, other.age);
	}
	
}