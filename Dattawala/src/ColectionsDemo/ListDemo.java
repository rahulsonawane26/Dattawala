package ColectionsDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {

		List<String> friends = getlistoffirnds();
		System.out.println(friends);
		getlengthoflistelements(getlistoffirnds());
		lengthofeachelementofthelist(getlistoffirnds());
	}

	public static List<String> getlistoffirnds() {
		List<String> student = new ArrayList<>();
		Iterator it =  student.iterator();
		HashSet<String> hs = new HashSet<String>();
		hs.isEmpty();
		
		student.add("Rahul");
		student.add("Shankar");
		student.add("Datta");
		student.add("Sachin");
		student.add("Sunil");
		
		
		//System.out.println(student);
		//System.out.println("-------------------");
		student.remove("Shankar");// Removed an object from the list
		// System.out.println(student);

		List<String> cbd = new ArrayList<>();
		cbd.add("Akbar");
		cbd.add("Amit");
		student.addAll(cbd);// Added collection in the list
		//System.out.println(student);
		return student;

	}
	
	
	public static int getlengthoflistelements(List<String> list) {
		
		int sizeoflist = list.size();
		System.out.println("There are "+ sizeoflist +" elements in my list");
		
		return sizeoflist;

	}
	
	public static void lengthofeachelementofthelist(List<String> list ) {
		
		for(int i= 0;i<list.size();i++) {
			//System.out.println("The "+i+"th Element is "+list.get(i)+" and length of "+list.get(i)+" is "+list.get(i).length());
			//System.out.println("The "+i+"th Element is "+list.get(i)+" and length of "+list.get(i)+" is "+list.get(i).toUpperCase());
			System.out.println("The "+i+"th Element is "+list.get(i)+" and length of "+list.get(i)+" is "+list.get(i).contains("a"));
		}
		
	}
}
