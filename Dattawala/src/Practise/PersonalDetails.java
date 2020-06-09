package Practise;

import java.util.Scanner;

public class PersonalDetails {

	String firstsname, lastname;
	static String mobile;

	public String getInput() {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		firstsname = scan.nextLine();
		System.out.println("Enter your last name: ");
		lastname = scan.nextLine();
		System.out.println("Enter your mobile number: ");
		mobile = scan.nextLine();
		return firstsname+" "+lastname;

	}

	public void display() {

		System.out.println("Your fullname is: " + firstsname + " " + lastname);
		System.out.println("Your mobile number is: " + mobile);

	}

	
	public static void main(String[] args) {

		PersonalDetails p = new PersonalDetails();
		
		p.getInput();
		p.display();
		p.checkValidMobileNumber(p.mobile);

	}
	
	public static void checkValidMobileNumber(String mobilenumber) {
		
		if(mobilenumber.length()==10) {
			
			System.out.println("Valid mobile number");
			
		}
		else {
			System.out.println("Invalid Mobile");
		}
	}
}
