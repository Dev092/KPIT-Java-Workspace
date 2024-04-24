
public class staticdubara {
	public static void main(String[] args) {
		Baloon b1ref=new Baloon("red");
		Baloon.count();
		Baloon b2ref=new Baloon("yellow");
		Baloon b3ref=new Baloon("blue");
		Baloon.count();
		
		
	}

}
class Baloon{
	String color;
	static int count;
	Baloon(String color)
	{
		this.color=color;
		count++;
	}
	static void count() {
		
		System.out.println(count);
	}
}
