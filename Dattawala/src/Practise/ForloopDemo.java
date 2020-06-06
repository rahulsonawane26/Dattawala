package Practise;

public class ForloopDemo {

	public static void oneToTentable(int statrt, int end ) {

		for (int i = statrt ; i <= end; i++) {

			for (int j = 1; j <= 10; j++) {

				System.out.print((i * j)+" " );
			}

			System.out.println();

		}
		System.out.println("***********************************");
	}

	public static void sumof1st10digits() {

		int sum = 0;

		for (int i = 0; i <= 10; i++) {

			sum = sum + i;

		}

		System.out.println("Sum of first 10 digits is : " + sum);
		System.out.println("***********************************");
	}

	public static void main(String[] args) {

		oneToTentable(10,20);
		sumof1st10digits();

	}

}
