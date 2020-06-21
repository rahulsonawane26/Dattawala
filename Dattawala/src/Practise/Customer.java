package Practise;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {

		Banking bank = new Banking();
		Scanner input = new Scanner(System.in);
		for (int i = 3; i > 0; i--) {
			System.out.println("Please enter your ATM pin number");
			int atmpin = input.nextInt();
			boolean validpin = bank.pin(atmpin);
			if (validpin == true) {
				System.out.println("******************************");
				System.out.println("Welcome to Bakwaas Bank");
				System.out.println("******************************");
				bank.operations();
				break;
			} else {
				System.out.println("Your Pin number is incorrect");
				System.out.println("You have " + (i - 1) + " attepmt(s) left");
				if (i == 1) {
					System.out.println("You exhausted your attempts. Kindly try next time after 24 hours");
					System.out.println("Thank You for Banking with us");
					System.exit(0);
				} else {
					continue;
				}
			}

		}
		
		System.out.println(" Do you want to continue"+"\n"+"1. Yes"+"\n"+"2. No");
		
		if(input.nextInt()==1) {
			
			main(args);
		}
		
		System.out.println("Thank You for Banking with us");
		System.exit(0);

	}
}