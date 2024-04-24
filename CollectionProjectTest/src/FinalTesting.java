import java.util.Iterator;
import java.util.TreeSet;

class Mobile implements Comparable<Mobile>{
	int prise;
	String Model;
	public Mobile(int prise, String model) {
		super();
		this.prise = prise;
		Model = model;
	}
	
	public String toString() {
		return "Mobile [prise=" + prise + ", Model=" + Model + "]";
	}
	
//	public int compareTo(Mobile that){
//		return Integer.compare(this.prise, that.prise);
//	}
	public int compareTo(Mobile other) {
        // Compare based on the Id
        return Integer.compare( other.prise,this.prise);
    }
	
}
public class FinalTesting {
	public static void main(String[] args) {
		TreeSet<Mobile>m1=new TreeSet<>();
		m1.add(new Mobile(200,"M01"));
		m1.add(new Mobile(150,"M11"));
		m1.add(new Mobile(280,"M22"));
		m1.add(new Mobile(876,"S22"));
		
		Iterator<Mobile>it=m1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
	}

}
