import java.util.InputMismatchException;
import java.util.Scanner;

public class Item {
	public static void main(String[] args) {
		Item2 item = new Item2();
		int cash = item.cashInHand;
		while(true) {
			try {
				item.sellItem();
			} catch (NumberNotMatchException e) {
				System.out.println(e);
			}
			int n = item.n, number = item.number, price = item.costPerItem;
			int count = 0;
			while(number > 0 && cash >= price) {
				count++;
				number--;
				cash -= price;
				System.out.println(item.item + " buy : " + count);
				System.out.println("Remaining Balace : " + cash);
			}
			if(cash <= 0) break;
		}
	}
}
class Item2 {
	int cashInHand;
	enum dishType {Burger,Pizza};
	int costPerItem;
	Item2() {
		cashInHand = 100;
	}
	dishType item = null;
	int n, number;// n -> enum , number -> numberOfItems
	
	void sellItem() throws NumberNotMatchException {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.println("1 for Burger and 2 for Pizza: ");
				n = sc.nextInt();
				if(n < 0 || n > 2) {
					NumberNotMatchException e = new NumberNotMatchException("Please Enter 1 for Burger and 2 for Pizza : ");
					throw e;
				}
			} catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Enter a valid Number : ");
			}
			if(n == 1 || n == 2) break;
		}
		switch(n) {
		case 1:
			item = dishType.Burger;
			costPerItem = 10;
			break;
		case 2:
			item = dishType.Pizza;
			costPerItem = 50;
			break;
		}
		while(true) {
			try {
				System.out.println("Enter number of " + item + " : ");
				number = sc.nextInt();
				if(number < 0) {
					NumberNotMatchException e = new NumberNotMatchException("Please Enter a positive Integer : ");
					throw e;
				}
			} catch(InputMismatchException e) {
				sc.nextLine();
				System.out.println("Enter a valid Number : ");
			}
			if(number > 0) break;
		}
		
	}
}
class NumberNotMatchException extends Exception {

	public NumberNotMatchException(String message) {
		super(message);
	}
	
}
