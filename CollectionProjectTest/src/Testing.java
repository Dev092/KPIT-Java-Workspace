
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
class Student implements Comparable<Student>{
	String name;
	int Id;
	int marks;
	
	public String toString() {
		return "Student [name=" + name + ", Id=" + Id + ", marks=" + marks + "]";
	}
	public Student(String name, int id, int marks) {
		//super();
		this.name = name;
		Id = id;
		this.marks = marks;
	}
	public int compareTo(Student that)
	{
		if(this.marks>that.marks)
			return 1;
		else
			return -1;
	}
}

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Comparator<Student>com=new Comparator<Student>() {
        	public int compare(Student i,Student j) {
        		if(i.marks>j.marks)
        			return 1;
        		else
        			return -1;
        	}
        };
		
		List<Student>tset=new ArrayList<>();
        tset.add(new Student("Dev",203,98));
        tset.add(new Student("Raj",204,88));
        tset.add(new Student("Don",205,96));
        
        System.out.println(tset);
        Iterator<Student>it=tset.iterator();
        while(it.hasNext()) {
        	System.out.println(it.next());
        }
        Collections.sort(tset);
        System.out.println(tset);

	}

}

 