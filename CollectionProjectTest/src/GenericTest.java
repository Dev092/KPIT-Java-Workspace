import java.util.Set;
import java.util.TreeSet;

class SkyKite{
	String color;
	int cost;
	public SkyKite(String color, int cost) {
		super();
		this.color = color;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Kite [color=" + color + ", cost=" + cost + "]";
	}
	
	public int compareTo(SkyKite k) {
		System.out.println("Comparing "+color+" with "+k.color);
		return Integer.compare(cost, k.cost);
	}
	
}
public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<SkyKite>kset=new TreeSet<>();
		kset.add(new SkyKite("Yellow",10));
		kset.add(new SkyKite("Red",12));

		kset.add(new SkyKite("Pink",9));

		kset.add(new SkyKite("Blue",16));
		
		System.out.println(kset);


	}

}
