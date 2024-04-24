package collectionFeameworkProject;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
	public static void  main(String[] args) {
		List<Integer>l1=new ArrayList();
		l1.add(20);
		l1.add(54);
		l1.add(67);
		l1.add(67);
		System.out.println(l1);
		l1.add(2,89);
		System.out.println(l1);
		System.out.println(l1.get(0));
		l1.remove(3);
		System.out.println(l1);
		l1.set(0, 9);
		System.out.println(l1.contains(9));
        l1.remove(Integer.valueOf(67));
        System.out.println(l1);


		
	}

}
