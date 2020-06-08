package Practise;

public class LeapYear {

	public static void main(String[] args) {

		int year = 1901;

		for (int i = year; i <= 2020; i++) {

			if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
				System.out.println(year);

			}
			year++;
		}

	}
}