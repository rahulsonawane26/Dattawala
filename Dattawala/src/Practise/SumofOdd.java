package Practise;

public class SumofOdd {

	public static void main(String[] args) {

		int odd = 0;

		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 1) {
				odd = odd + num;
			}
		}
		System.out.println(odd);
	}

}
