package Practise;

import java.util.Scanner;

public class TwoPyramid {

	public static void main(String[] args) {

		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("Enter the number of pyraminds required : ");
		 * 
		 * int NoOfPyrmids = input.nextInt();
		 */

		for (int k = 1; k <= 1; k++) {

			for (int i = 0; i <= 10; i++) {

				for (int j = 10; j >= i; j--) {

					System.out.print(" ");
				}

				for (int j = 0; j <= i; j++) {

					System.out.print(" *");
				}
				
				for (int j = 10; j >= i; j--) {

					System.out.print(" ");
				}

				for (int j = 10; j >= i; j--) {

					System.out.print(" ");
				}
			 
				for (int j = 0; j <= i; j++) {

					System.out.print(" *");
				}
				
				System.out.println();
			}

		}
	}

}
