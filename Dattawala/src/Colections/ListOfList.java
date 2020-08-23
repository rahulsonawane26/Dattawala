package Colections;

import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

public class ListOfList {

	public static void main(String[] args) {
		
		System.out.println(allFriends());
		System.out.println(allFriends().size());

	}

	static public ArrayList<String> cbdFriends() {

		ArrayList<String> cbd = new ArrayList<>();
		cbd.add("Butla");
		cbd.add("Sukhi");
		cbd.add("Amit");
		cbd.add("Vishal");
		cbd.add("Tarun");
		return cbd;

	}

	static public ArrayList<String> collegeFriends() {
		
		ArrayList<String> college = new ArrayList<>();
		college.add("Datta");
		college.add("Sachin");
		college.add("Sunil");
		college.add("Shankar");
		college.add("Mitesh");
		college.add("Krishna");
		college.add("Pramod");
		return college;

	}

	static public ArrayList<String> officeFriends() {

		ArrayList<String> office = new ArrayList<>();
		office.add("Bobby");
		office.add("Ashish");
		office.add("Kautubh");
		office.add("Babaso");
		office.add("Anoop");
		return office;
	}

	static public ArrayList<String> cousinFriends() {

		ArrayList<String> cousin = new ArrayList<>();
		cousin.add("Ashu");
		cousin.add("Pratik");
		cousin.add("Satej");
		cousin.add("Sam");
		return cousin;
	}


	static List<ArrayList<String>> allFriends() {
		
		List<ArrayList<String>> allfriends = new ArrayList<ArrayList<String>>();
		allfriends.add(cousinFriends());
		allfriends.add(officeFriends());
		allfriends.add(cbdFriends());
		allfriends.add(collegeFriends());
		
		return allfriends;
		
		}
}
