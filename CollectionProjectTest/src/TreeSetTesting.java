import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<Integer> tset=new TreeSet<>();
        tset.add(1);
        tset.add(8);
        tset.add(5);
        tset.add(4);
        tset.add(3);
        
        System.out.println(tset);
        tset.remove(4);
        Iterator<Integer>it=tset.iterator();
        while(it.hasNext()) {
        	System.out.print(it.next()+" ");
        	
        }
        System.out.println();
        System.out.println(tset.last());
        
        System.out.println(tset.first());
	}

}
