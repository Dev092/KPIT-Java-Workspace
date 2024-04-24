package elements.table;

import java.util.Iterator;
import java.util.TreeSet;

public class ChemicalElementTest {
	public static void main(String[] args) {
	TreeSet<ChemicalElement>tset=new TreeSet<>();
	tset.add(new ChemicalElement(1,"Hydrogen","H",2));
	tset.add(new ChemicalElement(2,"Hydrogen","H",2));
	tset.add(new ChemicalElement(7,"Oxygen","O",14));
	tset.add(new ChemicalElement(8,"Carbon","C",18));
	tset.add(new ChemicalElement(3,"Lithium","Li",6));
	tset.add(new ChemicalElement(4,"Berilium","Be",8));

	
	//Iterating the Tset
	Iterator<ChemicalElement>it=tset.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}

	}

	
	
	

}
