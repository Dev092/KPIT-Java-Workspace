
public class Exception2 {
	public static void main(String[] args) {
		
//		DrunkenMaster master = new DrunkenMaster();
//		master.drinkAndFight();
//		
//		DrunkenDisciple disciple = new DrunkenDisciple();
//		disciple.drinkAndFight();
	}
}

class BankException extends Exception { }

class MaturityException extends BankException {
	
}
//class DateException extends BankException { }

class SavingsAccount
{
	void withdraw() throws BankException//throws BankException
	{
		System.out.println("Master : witdhrawing.");
	}
}
class FixedDeposit extends SavingsAccount
{
//Exception KnockDownException is not compatible with throws clause 
	//in DrunkenMaster.drinkAndFight()
	void withdraw() throws MaturityException//, DateException
	{
		System.out.println("Disciple : Drinking and Fighting..");

	}
}