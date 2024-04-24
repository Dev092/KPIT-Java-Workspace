
public class statictest {
	public static void main(String[] args) {
		Human href=new Human(3,"ram");
		Human href2=new Human(2,"dev");
		Human href3=new Human(7,"pam");
		System.out.println(Human.population);
		
	}

}
 class Human{
	int age;
	String name;
	static long population;
	public Human(int age, String name) {
		super();
		this.age = age;
		this.name = name;
		Human.population +=1 ;
	}
	
}