package oopsproject;

public class primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=17;
		boolean ans=true;
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
			{
				ans=false;
				break;
			}
		}
		System.out.println(ans);

	}

}
