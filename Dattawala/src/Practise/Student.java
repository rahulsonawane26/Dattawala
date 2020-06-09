package Practise;

public class Student {
	
	public static void main(String[] args) {
		
		
		CalusingMethods calci = new CalusingMethods();
		System.out.println("Addition is: "+calci.addition(100, 200));
		
		int num1=100, num2=200;
		
		calci.subtraction(num1, num2);
		System.out.println("Subtract is: "+calci.subtraction(109, 110));
		System.out.println("Mul is: "+calci.multiplication(num1, num2));
		System.out.println("Div is: "+calci.division(123, 123));
		
		for (int a=0 ; a<=10;a++) {

			calci.checkevenorodd(a);
		}
		
		
	}

}
