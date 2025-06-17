package oops;

//Class definition
class Student {
	// Fields (attributes)
	int id;
	String name;

	// Default constructor
	Student() {
		System.out.println("Default constructor called");
	}

	// Parameterized constructor
	Student(int i, String n) {
		id = i;
		name = n;
	}

	// Method to display student info
	void display() {
		System.out.println("ID: " + id + ", Name: " + name);
	}
}


public class JavaConstructor {
	public static void main(String[] args) {
		// Creating object with default constructor
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "Alice";
		s1.display();

		// Creating object with parameterized constructor
		Student s2 = new Student(2, "Bob");
		s2.display();
	}

}
