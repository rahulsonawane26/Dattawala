package Practise;

import java.util.Scanner;

public class Pyramid {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of layers you want in a Pyramid: ");
		int layer = scan.nextInt();

		for (int a = 0; a <= layer; a++) {

			for (int b = 10; b >= a; b--) {

				System.out.print(" ");
			}
			
			for (int b = 0; b <= a; b++) {

				System.out.print("*");
			}
			
			for (int b = 1; b <= a; b++) {

				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}