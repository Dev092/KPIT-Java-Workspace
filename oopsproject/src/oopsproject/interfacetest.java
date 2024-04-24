package oopsproject;

public class interfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class human{
	
}
class person{
	char gender;
	int age;
	String name;
	public person(char gender, int age, String name) {
		super();
		this.gender = gender;
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "person [gender=" + gender + ", age=" + age + ", name=" + name + "]";
	}
	
}