package Practise;

import java.util.Scanner;

public class CheckNumber {

	static int a, b;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter any number: ");
		a = input.nextInt();

		if (a < 0) {
			System.out.println("The given number is a Negative number");
		} else if (a > 0) {
			System.out.println("The given number is a Positive number");
		} else {
			System.out.println("The given number is a Zero number");
		}

		if (a >= 2 && a % 2 == 1) {
			System.out.println("The given number is a Prime number");
		} else {
			System.out.println("The given number is a Not a Prime number");
		}

		if (a % 2 == 0) {
			System.out.println("The given number is a Even number");
		} else {
			System.out.println("The given number is a Odd number");
		}

		if (a % 3 == 0) {
			if (a % 5 == 0) {
				System.out.println("The given number is a divisible by both 3 & 5");
			} else {
				System.out.println("The given number is  divisible only by 3 and not by 5");
			}
		} else {
			if (a % 5 == 0) {
				System.out.println("The given number is a divisible only by 5 and not by 3");
			} else {
				System.out.println("The given number is NOT divisible by both 3 & 5");
			}
		}
	}
}
