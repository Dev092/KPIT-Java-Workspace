package oopsproject;

public class practice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		typesofmethods tyref=new typesofmethods();
		tyref.fun();
		tyref.fun(9876.0f);
		tyref.fun1();

	}

}
class typesofmethods{
	void fun()
	{
		System.out.println("No return type no arguments");
	}
	void fun(float x) {
		System.out.println("no return type but arguments"+x);
	}
	double fun1()
	{
		double a=987;
		System.out.println("with return type but no arguments");
		return a;
	}
}

