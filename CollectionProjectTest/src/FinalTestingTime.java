import java.util.Iterator;
import java.util.TreeSet;

public class FinalTestingTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Food>f1=new TreeSet<>();
		f1.add(new Food("Makham",45));
		f1.add(new Food("misri",35));
		Iterator<Food>it=f1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		

	}

}
class Food implements Comparable<Food>{
	String name;
	int prise;
	public Food(String name, int prise) {
		super();
		this.name = name;
		this.prise = prise;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrise() {
		return prise;
	}
	public void setPrise(int prise) {
		this.prise = prise;
	}
	@Override
	public String toString() {
		return "Food [name=" + name + ", prise=" + prise + "]";
	}
	public int compareTo(Food other) {
		return Integer.compare(this.prise, other.prise);
	}
}
