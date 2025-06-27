package collections;

import java.util.*;

public class JavaCollectionExample {
	public static void main(String[] args) {

		// List Example - allows duplicates, maintains order
		List<String> students = new ArrayList<>();
		students.add("Alice");
		students.add("Bob");
		students.add("Charlie");
		students.add("Alice"); // duplicate allowed

		System.out.println("Students List:");
		for (String name : students) {
			System.out.println(name);
		}

		// Set Example - no duplicates
		Set<String> courses = new HashSet<>();
		courses.add("Math");
		courses.add("Science");
		courses.add("History");
		courses.add("Math"); // duplicate ignored

		System.out.println("\nUnique Courses:");
		for (String course : courses) {
			System.out.println(course);
		}

		// Map Example - key-value pairs
		Map<String, Integer> studentGrades = new HashMap<>();
		studentGrades.put("Alice", 85);
		studentGrades.put("Bob", 90);
		studentGrades.put("Charlie", 75);

		System.out.println("\nStudent Grades:");
		for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}

}
