package CompanyKpit;

import java.util.Scanner;

import Exceptions.FoodException;
import Exceptions.IdCardException;
import Exceptions.LaptopException;

public class KpitCom {
	public KpitCom() throws FoodException, IdCardException, LaptopException{
		String food="Poha";
		boolean IdCard=true;
		boolean Laptop=true;
	
		
		if(food=="Poha") {
			System.out.println("Ready to go with poha");
			
		}
		else {
			FoodException ex=new FoodException("Make poha first");
			throw ex;
		}
		
		if(IdCard==true) {
			System.out.println("Ready to go with IDCard");
			
		}
		else {
			IdCardException ex=new IdCardException("Take your Id Card");
			throw ex;
		}
		
		if(Laptop==true) {
			System.out.println("Ready to go with Laptop");
			
		}
		else {
			LaptopException ex=new LaptopException("Take your Laptop");
			throw ex;
		}
		
	}
	
	
	public void checkingLunch() throws FoodException {
		System.out.println("What amount of food you carry:");
		Scanner sc=new Scanner(System.in);
		int quantity=sc.nextInt();
		
		if(quantity>=500) {
			System.out.println("Quantity is fine for your meal");
		}else {
			FoodException ex=new FoodException("Add more food in LuncfBox");
			throw ex;
		}
	}

}
