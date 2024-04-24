package collectionFeameworkProject;

import java.util.LinkedList;

public class LinkedListTest {
	public static void main(String[] args) {
		LinkedList<Integer>l1=new LinkedList<>();
		l1.add(5);
		l1.add(78);
		l1.add(98);
		l1.add(76);
		l1.add(34);
		l1.add(45);
		System.out.println(l1);
		l1.remove(1);
		System.out.println(l1);
		l1.removeFirst();
		System.out.println(l1);
        l1.removeLast();
		System.out.println(l1);
		System.out.println(l1.size());


		
	}

}
