
public class Exceptiontest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=8;
		int b=0;
		
		try {
			
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println(e+" Divide by zero nhi hota bhai");
			System.out.println("Diff method");
			e.printStackTrace();
		}

	}

}
