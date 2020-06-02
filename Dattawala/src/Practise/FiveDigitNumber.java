package Practise;

import java.util.Scanner;

public class FiveDigitNumber {

	static int a,b;
	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number upto 5 digits: ");
		a =input.nextInt();
		
		if (a<=0) {
			
			System.out.println("Invalid Number");
		}
		
		else if ((a>0)&&(a<= 9 )) {
			
			System.out.println("This is a 1 digit number");
		}
		else if (((a>9)&&(a<= 99 )) ) {
			
			System.out.println("This is a 2 digit number");
		}
		else if (((a>99)&&(a<= 999 )) ) {
			
			System.out.println("This is a 3 digit number");
		}
		
		else if (((a>999)&&(a<= 9999 )) ) {
			
			System.out.println("This is a 4 digit number");
		}
		else if (((a>9999)&&(a<= 99999 )) ) {
			
			System.out.println("This is a 5 digit number");
		}
		else System.out.println("This is more than 5 digit number");

	}

}
