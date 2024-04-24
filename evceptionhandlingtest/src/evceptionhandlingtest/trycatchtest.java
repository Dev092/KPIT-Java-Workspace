package evceptionhandlingtest;

public class trycatchtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=8;
			int b=0;
			int c=a/b;
			System.out.println("ans is: "+c);
		}
		catch(Exception e){
			System.out.println("There is arithmetic error "+e);
		}

	}

}
