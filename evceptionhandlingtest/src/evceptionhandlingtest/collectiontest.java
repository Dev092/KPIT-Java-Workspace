package evceptionhandlingtest;
import java.util.*;
import java.util.TreeSet;

import java.util.Iterator;
public class collectiontest {
	public static void main(String[] args) {
	TreeSet<elements>preodictable=new TreeSet<elements>();
		preodictable.add(new elements(1,2,"H"));
		preodictable.add(new elements(2,4,"He"));
		preodictable.add(new elements(3,6,"Li"));
        Iterator<elements>elementiterator=preodictable.iterator();
        while(elementiterator.hasNext()) {
        	elements ele=elementiterator.next();
        	System.out.println("Element :"+ele);
        }
}
}
class elements implements Comparable<elements>{
	int atomicno;
	int atomicwt;
	String element;
	public elements(int atomicno, int atomicwt, String element) {
		super();
		this.atomicno = atomicno;
		this.atomicwt = atomicwt;
		this.element = element;
	}
	@Override
	public String toString() {
		return "elements [atomicno=" + atomicno + ", atomicwt=" + atomicwt + ", element=" + element + "]";
	}
	@Override
	public int compareTo(elements o) {
		// TODO Auto-generated method stub
		System.out.println("Comparing element " + element + " with " + o.element);
		return Integer.compare(atomicno,o.atomicno);
	}
	
}
