package com.car;

import org.springframework.stereotype.Component;

public class Cartest {
	public static void main(String[] args) {
		
	}

}
@Component
class carFactory{
	
	void getcar() {
		System.out.println("FRT");
	}
	
}
@Component
class shop{
	carFactory cf;
	void getcar() {
		cf=new carFactory();
		cf.getcar();
	}
}
@Component

class customer{
	shop s;
	void getcar() {
		s=new shop();
		s.getcar();
	}
}
