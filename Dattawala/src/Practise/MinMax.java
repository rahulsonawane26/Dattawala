package Practise;

import java.util.Scanner;

public class MinMax {

	static int a,b,c;
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number 1: ");
		a= input.nextInt();
		System.out.println("Enter number 2: ");
		b= input.nextInt();
		System.out.println("Enter number 3: ");
		c= input.nextInt();
		
		if ((a>b)&&(c>b)&&(c>a)) {
			
			System.out.println("The max number is :"+c+" and The min number is : "+b);
		}
		else if ((a>b)&&(c>b)&&(c<a)) {
			
			System.out.println("The max number is :"+a+" and The min number is : "+b);
		}
		else if ((b>a)&&(c>a)&&(b>c)) {
			
			System.out.println("The max number is :"+b+" and The min number is : "+a);
		}
		else if ((b>a)&&(c>a)&&(c>b)) {
			
			System.out.println("The max number is :"+c+" and The min number is : "+a);
		}
		else if ((a>c)&&(b>c)&&(b>a)) {
			
			System.out.println("The max number is :"+b+" and The min number is : "+c);
		}
		else if ((a>c)&&(b>c)&&(a>b)) {
			
			System.out.println("The max number is :"+a+" and The min number is : "+c);
		}
		else if ((a==c)&&(b>c)) {
			
			System.out.println("The max number is :"+b+" and The min number is : "+c+" and "+a);
		}
		else if ((a==c)&&(b<c)) {
			
			System.out.println("The min number is :"+b+" and The max number is : "+c+" and "+a);
		}
		else if ((b==c)&&(a<c)) {
			
			System.out.println("The min number is :"+a+" and The max number is : "+b+" and "+c);
		}
		else if ((b==c)&&(a>c)) {
			
			System.out.println("The max number is :"+a+" and The min number is : "+b+" and "+c);
		}else if ((a==b)&&(a<c)) {
			
			System.out.println("The max number is :"+c+" and The min number is : "+b+" and "+a);
		}
		else if ((a==b)&&(a>c)) {
			
			System.out.println("The min number is :"+c+" and The min number is : "+a+" and "+b);
		}
		else System.out.println("All numbers are same ");
	}

}
