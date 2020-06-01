package Practise;

import java.util.Scanner;

public class Calculator {

	static int a, b, calculator, choice1, choice2;

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter number a: ");
		try {
			a = input.nextInt();

			System.out.println("Enter number b: ");

			b = input.nextInt();

		} catch (Exception e) {

			System.out.println("Went wrong");
			throw new Exception(e);

		}
		System.out.println("You have entered " + a + " and " + b);

		System.out.println("Select the calculator: ");
		System.out.println("1. Simple");
		System.out.println("2. Complex");

		calculator = input.nextInt();

		switch (calculator) {

		case 1:
			System.out.println("You have selected Simple calculator");
			System.out.println("Select the operations: ");

			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Modulus");

			choice1 = input.nextInt();

			switch (choice1) {

			case 1:
				System.out.println(a + b);
				break;
			case 2:
				System.out.println(a - b);
				break;
			case 3:
				System.out.println(a * b);
				break;
			case 4:
				System.out.println(a / b);
				break;
			case 5:
				System.out.println(a % b);
				break;
			default:
				System.out.println("wrong choice");
				break;
			}

			break;
		case 2:
			System.out.println("You have selected Complex calculator");
			System.out.println("Select the operations: ");

			System.out.println("1. Square");
			System.out.println("2. Cube");

			choice2 = input.nextInt();
			switch (choice2) {

			case 1:
				System.out.println("Square is: " + (a * a));
				break;
			case 2:
				System.out.println("Cube is: " + (a * a * a));
				break;
			default:
				System.out.println("wrong choice");
				break;

			}
			break;

		default:
			System.out.println("Incorrect choice of calculator");

		}

	}

}
