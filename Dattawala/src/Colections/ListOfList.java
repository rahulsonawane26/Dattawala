package Colections;

import java.util.ArrayList;
import java.util.List;

public class ListOfList {

	public static void main(String[] args) {
		
		System.out.println(allFriends());
		
		System.out.println(allFriends().size());
		
		System.out.println(allFriends().get(2));
		System.out.println(allFriends().get(1).length());

	}

	static public List<String> cbdFriends() {

		List<String> cbd = new ArrayList<>();
		cbd.add("Butla");
		cbd.add("Sukhi");
		cbd.add("Amit");
		cbd.add("Vishal");
		cbd.add("Tarun");
		return cbd;

	}

	static public List<String> collegeFriends() {
		List<String> college = new ArrayList<>();
		college.add("Datta");
		college.add("Sachin");
		college.add("Sunil");
		college.add("Shankar");
		college.add("Mitesh");
		college.add("Krishna");
		college.add("Pramod");
		return college;

	}

	static public List<String> officeFriends() {

		List<String> office = new ArrayList<>();
		office.add("Bobby");
		office.add("Ashish");
		office.add("Kautubh");
		office.add("Babaso");
		office.add("Anoop");
		return office;
	}

	static public List<String> cousinFriends() {

		List<String> cousin = new ArrayList<>();
		cousin.add("Ashu");
		cousin.add("Pratik");
		cousin.add("Satej");
		cousin.add("Sam");
		return cousin;
	}

	static List<String> allFriends() {

			List<String> friends = new ArrayList<>();
			friends.addAll(cousinFriends());
			friends.addAll(officeFriends());
			friends.addAll(collegeFriends());
			friends.addAll(cbdFriends());
			return friends;
		}
}
