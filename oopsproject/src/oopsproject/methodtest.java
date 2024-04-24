package oopsproject;

public class methodtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BankAccount1 bankaccobjRef1=new BankAccount1();
        bankaccobjRef1.withdraw();
        bankaccobjRef1.withdraw(8000.0f);
        double rembal=bankaccobjRef1.withdraw(4000.0);
        System.out.println("Rem Bal..."+rembal);
        double mybal=bankaccobjRef1.whatisbalance();
        System.out.println(mybal);
	}
}

class BankAccount1
{
	double currentbalance=500000;
	//1.fun without arguments
	void withdraw()
	{
		System.out.println("Withdrawing");
	}
	//2.fun with args and without return type
	void withdraw(float amounttowithdraw)
	{
		System.out.println("Withdrawing...." +amounttowithdraw);
		currentbalance=currentbalance-amounttowithdraw;
	}
	//3. with args and return value
	double withdraw(double amounttowithdraw)
	{
		System.out.println("Withdrawing,=.."+amounttowithdraw);
		currentbalance=currentbalance-amounttowithdraw;
		return currentbalance;
	}
	//4.without arg and with return
	double whatisbalance()
	{
		System.out.println("Finding....");
		return currentbalance;
	}
}




