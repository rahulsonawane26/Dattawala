package Practise;

import java.util.Scanner;

public class Banking {

	static int amount = 100000;
	static int deposit = 0;
	static int withdraw = 0;
	Scanner input = new Scanner(System.in);

	public boolean pin(int atmpin) {
		if (atmpin == 1234) {
			return true;
		} else {
			return false;
		}
	}

	public int balance() {

		return amount;
	}

	public void deposit(int deposit) {

		amount = amount + deposit;

	}

	public void withdraw(int withdraw) {

		if (withdraw > amount) {
			System.out.println(
					"You dont have sufficient balance to withdraw." + "\n" + "You can only withdraw upto: " + amount);
		}

		else {

			amount = amount - withdraw;
		}
	}

	public void operations() {

		System.out.println("Please enter your choice." + "\n" + "1. Check your Balance" + "\n" + "2. Withdraw" + "\n"
				+ "3. Deposit");
		int choice = input.nextInt();
		switch (choice) {

		case 1:
			System.out.println("The amount in your account is: " + balance());
			break;
		case 2:
			System.out.println("Enter the Amount you want to withdraw");
			int withdraw = input.nextInt();
			withdraw(withdraw);
			System.out.println("The amount in your account is: " + balance());
			break;

		case 3:
			System.out.println("Enter the Amount you want to withdraw");
			int deposit = input.nextInt();
			deposit(deposit);
			System.out.println("The amount in your account is: " + balance());
			break;

		default:
			System.out.println("Thats an invalid choice. Do you want to try again"+"\n"+"1. Yes"+"\n"+"2. No");
			
			if(input.nextInt()==1) {
				
				operations();
			}
			else {
				
				System.out.println("Thank You for Banking with us");
			}
			
		}
		

	}

}