package Practise;

import java.util.Scanner;

public class Address {
	
	String line;
	String pin;
	
	Address(String line, String pin ) {
		
		this.line=line;
		this.pin=pin;
		
		
	}

	public static void main(String[] args) {
		
		
		Address add = new Address("Nerul", "400614");
		Students s = new Students("Rahu", "987643210", add);
		s.dispay();
	}
	
}
