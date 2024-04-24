import java.util.ArrayList;
import java.util.List;

public class ArrayListTesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kite kiteArray[]=new Kite[5];
		kiteArray[0]= new Kite("Dev",56,98);
		kiteArray[1]= new Kite("Devi",5,38);
		kiteArray[2]= new Kite("Divya",6,9);
		kiteArray[3]= new Kite("Divanshu",2,90);
		
		System.out.println(kiteArray[0]);
		
		
		

	}

}

class Kite {
	String name;
	int Id;
	int len;
	public Kite(String name, int id, int len) {
		super();
		this.name = name;
		Id = id;
		this.len = len;
	}
	@Override
	public String toString() {
		return "Kite [name=" + name + ", Id=" + Id + ", len=" + len + "]";
	}
	
}
