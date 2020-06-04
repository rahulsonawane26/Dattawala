package Practise;

import java.util.Scanner;

public class ProductChoice {

	static int choice, mobile, laptop, television;

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter the choice of your Product: ");
		System.out.println("Choose 1 for Mobiles ");
		System.out.println("Choose 2 for Laptops ");
		System.out.println("Choose 3 for Television ");

		try {
			choice = input.nextInt();
		} catch (Exception e) {
			System.out.println("Thats an invalid choice. Please choose numbers only");
			throw new Exception(e);
		}

		switch (choice) {

		case 1:
			System.out.println("You have chosen Mobiles. Now choose the vendor");

			System.out.println("Choose 1 for Samsung ");
			System.out.println("Choose 2 for Apple ");
			System.out.println("Choose 3 for Google ");

			try {
				mobile = input.nextInt();
			} catch (Exception e) {
				System.out.println("Thats an invalid choice");
				throw new Exception(e);
			}

			switch (mobile) {
			case 1:
				System.out.println("You have chosen Samsung mobile");
				break;
			case 2:
				System.out.println("You have chosen Apple mobile");
				break;
			case 3:
				System.out.println("You have chosen Google mobile");
				break;
			default:
				System.out.println("Invalid choice of mobile");

			}

			break;

		case 2:
			System.out.println("You have chosen Laptops. Now choose the vendor");

			System.out.println("Choose 1 for HP  ");
			System.out.println("Choose 2 for Apple ");
			System.out.println("Choose 3 for Dell  ");

			try {
				laptop = input.nextInt();
			} catch (Exception e) {
				System.out.println("Thats an invalid choice");
				throw new Exception(e);
			}

			switch (laptop) {
			case 1:
				System.out.println("You have chosen HP Laptop");
				break;
			case 2:
				System.out.println("You have chosen Apple Laptop");
				break;
			case 3:
				System.out.println("You have chosen Dell Laptop");
				break;
			default:
				System.out.println("Invalid choice of Laptop");
			}
			break;

		case 3:
			System.out.println("You have chosen television. Now choose the vendor");

			System.out.println("Choose 1 for Sony ");
			System.out.println("Choose 2 for Samsung ");
			System.out.println("Choose 3 for Onida ");

			try {
				television = input.nextInt();
			} catch (Exception e) {
				System.out.println("Thats an invalid choice");
				throw new Exception(e);
			}

			switch (television) {
			case 1:
				System.out.println("You have chosen Sony television");
				break;
			case 2:
				System.out.println("You have chosen Samsung television");
				break;
			case 3:
				System.out.println("You have chosen Onida television");
				break;
			default:
				System.out.println("Invalid choice of television");
			}
			break;
		default:
			System.out.println("Invalid choice of Product");
		}

	}

}
