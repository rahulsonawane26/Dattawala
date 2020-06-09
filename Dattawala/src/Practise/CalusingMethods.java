package Practise;

public class CalusingMethods {

	public int addition(int a, int b) {

		return a + b;

	}

	public int subtraction(int a, int b) {

		return a - b;
	}

	public int multiplication(int a, int b) {

		return a * b;
	}

	public int division(int a, int b) {

		return a / b;

	}
	
	public void checkevenorodd(int a) {
		
		if(a%2==0) {
			
			System.err.println(a+" is a Even number");
			}
		else {
			System.err.println(a+" is a Odd number");
		}
	}
}
