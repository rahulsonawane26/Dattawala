package Practise;

import java.util.Scanner;

public class Bank {

	static int atm = 1234;
	static int balance = 30000;
	static int pin = 0;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("******************************");
		System.out.println("Welcom to Bakwaas Bank");
		System.out.println("******************************");

		for (int i = 3; i > 0; i--) {
			System.out.println("Please enter your 4 digit ATM pin to proceed --");
			pin = input.nextInt();
			if (pin == atm) {
				System.out.println(
						"Your ATM pin is correct." + "\n" + "-----------------------------------------------------");
				i = 0;
				
				
				System.out.println("Enter your choice-------" + "\n" + "1> BALANCE-" + "\n" + "2> WITHDRAW" + "\n"
						+ "3> DEPOSIT" + "\n");

				int choice = input.nextInt();

				switch (choice) {

				case 1:
					System.out.println("The balance in your account currently is: $" + balance);
					break;

				case 2:
					System.out.println(
							"You have chosen to WITHDRAW." + "\n" + " How much Amount would you like to witdraw");

					int wAmount = input.nextInt();
					if (wAmount <= balance) {
						balance = balance - wAmount;
						System.out.println(
								"You have withdrawn $" + wAmount + "\n" + "The current balance now is $" + balance);
					} else {
						System.out.println("You dont have enough Balance in your Account. Try next time");
					}
					break;

				case 3:
					System.out.println(
							"You have chosen to DEPOSIT." + "\n" + " How much Amount would you like to deposit");

					int dAmount = input.nextInt();
					balance = dAmount + balance;
					System.out.println(
							"You have deposited $" + dAmount + "\n" + "The current balance now is $" + balance);
					break;

				default:
					System.out.println("That is an incorrect choice");
					

				}
			} else {
				System.out.println("ATM pin is incorrect. You have " + (i - 1) + " attempt(s) left.");
				if (i == 1) {
					System.out.println("You have attempted 3 times. Your acccount is blocked .Please call the bank ");
				}
			}

		}

		System.out.println("------------- Thank You for Banking with us ---------------");
	}
}
