package com.zender;

public class Exception3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=9,b=0,c;
			c=a/b;
			System.out.println(c);
			
			
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		finally {
			System.out.println("Done");
			
		}

	}

}
