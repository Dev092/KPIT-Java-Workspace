package oopsproject;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        DiffMethods d1=new DiffMethods();
        d1.fun1();
        d1.fun1(8787.0f);
        System.out.println(d1.fun3());
        System.out.println(d1.fun4(986));
	}

}

class DiffMethods
{
	void fun1()
	{
		System.out.println("NO parameter,no returntype");
	}
	void fun1(float x)
	{
		System.out.println(x);
	}
	double fun3()
	{
		double a=9898;
		return a;
	}
	double fun4(double x)
	{
		return x;
	}
}
