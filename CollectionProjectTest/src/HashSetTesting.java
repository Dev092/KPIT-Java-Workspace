
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTesting {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<>();
		set1.add(5);
		set1.add(9);
		set1.add(7);
		set1.add(4);
		set1.add(6);
		//set1.addAll(set2);
		System.out.println(set1);
		set1.remove(4);
		Iterator<Integer>it=set1.iterator();
		while(it.hasNext()) {
		System.out.print(it.next()+" ");
		}
	}

}
