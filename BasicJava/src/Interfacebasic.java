
public class Interfacebasic {
	public static void main(String[] args) {
		BankAccount baAcc1 = new BankAccount(101,"Prakhar",50000);
		BankAccount baAcc2 = new BankAccount(102,"Chahat",55000);
	
		baAcc1.showBankAccount();
		baAcc2.showBankAccount();
		
		FundTransfer.transfer(baAcc1, baAcc2, 7000);
		
		baAcc1.showBankAccount();
		baAcc2.showBankAccount();
	}

}
interface withdraw{
	void withdraw(float amt);
}
interface deposit{
	void deposit(float amt);
}
class FundTransfer{
	static void transfer(BankAccount source, BankAccount target, float amountToTransfer)
	{
		System.out.println("--Transfer in Progress---");
		source.deposit(amountToTransfer);
		target.withdraw(amountToTransfer);
		System.out.println("--- Funds Transferred ----");
	}
}
class BankAccount implements withdraw, deposit { //extends Object 
	int accountNumber;
	String accountHolder;
	double accountBalance;
	BankAccount(int x, String y, double z) { //explicit no-arg ctor
		System.out.println("BankAccount ctor...");
		accountNumber=x;
		accountHolder=y;
		accountBalance=z;
	}
	
	//either implicit or explicit but not both
	public void withdraw(float amt) {
		System.out.println(accountHolder+" is withdrawing..."+amt);
		accountBalance -= amt;
	}
	public void deposit(float amt) {
		System.out.println(accountHolder+" is depositing..."+amt);
		accountBalance += amt;
	}
	void showBankAccount() {
		System.out.println("------object hashcode---"+toString());
		System.out.println("ACNO   : "+accountNumber);
		System.out.println("ACNAME : "+accountHolder);
		System.out.println("ACBAL  : "+accountBalance);
		System.out.println("-------------------");
	}
}