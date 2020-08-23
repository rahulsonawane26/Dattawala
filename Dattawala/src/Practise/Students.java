package Practise;

public class Students {

	String name,mobile,marks;
	Address address;
	
	Students(String name, String mobile, Address address )  {
	
		this.name = name;
		this.mobile = mobile;
		this.address= address;
	}
	
	Students(String name, String mobile, String marks )  {
		
		this.name = name;
		this.mobile = mobile;
		this.marks = marks;
	}
	
	public void dispay() {
		
		System.out.println("This is "+name+" "+ mobile);
		System.out.println("Address is "+address.pin+" "+address.line );
	}
	
}
