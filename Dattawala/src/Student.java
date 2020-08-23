
public class Student {

	String name, Add;
	int id;

	public Student(int id, Student S) {

		this.id = id;
		System.out.println("Student Id is " + id);
		S.display();

	}

	public Student() {
		
	}

	public void display() {

		System.out.println("Name is " + id);

	}

	public static void main(String[] args) {

		Student s = new Student();
		s.display();
		Student rahul1 = new Student( 100, s );
		rahul1.display();
		
		
	}

}
