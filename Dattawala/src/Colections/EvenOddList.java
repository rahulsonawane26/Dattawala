package Colections;

import java.util.ArrayList;
import java.util.List;

public class EvenOddList {

	public static void main(String[] args) {

		ArrayList<Integer> evenList = new ArrayList<>();
		ArrayList<Integer> oddList = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {

			if (i % 2 == 0) {

				evenList.add(i);

			} else {

				oddList.add(i);
			}

		}

		System.out.println(evenList);
		System.out.println(oddList);
	}
}
