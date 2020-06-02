package Practise;

import java.util.Scanner;

public class Marks {

	static int a;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter your marks: ");

		a = input.nextInt();

		if ((a >= 0) && (a <= 34)) {

			System.out.println("You FAILED");
		} else if ((a > 34) && (a <= 59)) {

			System.out.println("You have Passed");
		} else if ((a > 59) && (a <= 74)) {

			System.out.println("You have First Class marks");
		} else if ((a > 74) && (a <= 100)) {
			System.out.println("You have Distiction marks");
		} else
			System.out.println("Invalid marks");
	}
}
