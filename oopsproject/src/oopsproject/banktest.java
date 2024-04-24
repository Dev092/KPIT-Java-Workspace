package oopsproject;


public class banktest {

	public static void main(String[] args) {
	bankaccount ba1=new bankaccount(101,"DEV",20000);
    ba1.showbankaccount();
    creditcardaccount card1=new creditcardaccount(102,"Shayam",2000,2);
    card1.withdraw(87);
    fixeddepositaccount fdacc1=new fixeddepositaccount(103,"Ram",20000,2,9);
	fdacc1.intbalance();
	}

}
class bankaccount{
	int accnumber;
	String accholder;
	double accbalance;
	
	bankaccount(int x,String y,double z){
		System.out.println("Bankaccount ctor...");
		accnumber=x;
		accholder=y;
		accbalance=z;
	}
	
	void withdraw(float amt) {
		System.out.println(accholder+" is withdrawing "+amt);
	    accbalance-=amt;
	}
	void deposit(float amt) {
		System.out.println(accholder+" is depositing..."+amt);
		accbalance+=amt;
	}
	void showbankaccount() {
		System.out.println("ACNO   : "+accnumber);
		System.out.println("ACNAME : "+accholder);
		System.out.println("ACBAL  : "+accbalance);
		System.out.println("-------------------");
	}
}
class creditcardaccount extends bankaccount{
	double wamt;
	
	creditcardaccount(int u,String v,double w,double x){
		super(u,v,w);
		wamt=u;
		
	}
	
	void withdraw(float amt) {
		
		System.out.println(accholder+" credit "+amt);
		accbalance-=amt;
		}
}
class savingaccount extends bankaccount{
	float rateofinterest;
	savingaccount(int a,String b,double c,float d){
		super(a,b,c);
		rateofinterest=d;
		System.out.println("SavingsAccount ctor...");
	}
	void calculatesimpleinterest() {
		double si=(accbalance*1*rateofinterest)/100;
	    System.out.println("SI : "+si);
	}
	void showbankbalance() {
		super.showbankaccount();
		System.out.println("Rate : "+rateofinterest);;
	}
}
class fixeddepositaccount extends savingaccount{
	int interest;
	fixeddepositaccount(int p,String q,double r,float s,int t){
		super(p,q,r,s);
		interest=t;
	}
	void intbalance() {
		double a=accbalance*9*1;
		System.out.println("Amount after interest is : "+a);
	}
}