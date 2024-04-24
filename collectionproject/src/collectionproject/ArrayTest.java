package collectionproject;

public class ArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kite[] k=new kite[5];
		
		
		
		int arr[]=new int[7]; 
		

}
class kite{
	String color;
	String name;
	public kite(String color, String name) {
		super();
		this.color = color;
		this.name = name;
	}
	@Override
	public String toString() {
		return "kite [color=" + color + ", name=" + name + "]";
	}
}
}