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
				break;
			} else {
				System.out.println("Your Pin number is incorrect");
				System.out.println("You have " + (i - 1) + " attepmt(s) left");
				if (i == 1) {
					System.out.println("You exhausted your attempts. Kindly try next time after 24 hours");
				} else {
					continue;
				}
			}

		}

		bank.operations();
		
		
	}
}