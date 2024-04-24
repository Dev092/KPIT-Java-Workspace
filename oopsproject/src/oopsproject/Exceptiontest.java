package oopsproject;

public class Exceptiontest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("begin main");
		try{
		int num=10;
		System.out.println(num);
		int deno=0;
		System.out.println(deno);
		int div=num/deno;   //it will give exception -arithmetic exception
		System.out.println(div);
		}
		
		catch(ArithmeticException x){
			System.out.println("Some problem "+x);
		}
		
	}

}
