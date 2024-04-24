package collectionproject;

public class GenericTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//System.out.println(s);
        swap<Integer>intpair=new swap<Integer>(9,7);
	}

}
class swap<T>{
	T a;
	T b;
	public swap(T a,T b) {
		super();
		this.a = a;
		this.b = b;
	}
	void swappair() {
		T temp=a;
		a=b;
		b=temp;
	}
	@Override
	public String toString() {
		return "swap [a=" + a + ", b=" + b + "]";
	}
	
}