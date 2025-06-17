package basic;

public class JavaVariables {
	
	// Class variable (static)
    static int totalObjects = 0;

    // Instance variables
    String name;
    int age;

    // Constructor
    public JavaVariables(String name, int age) {
        this.name = name;
        this.age = age;
        totalObjects++; // Increase the static counter
    }

    public void displayInfo() {
        // Local variable
        String message = "User Info:";

        System.out.println(message);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }


	public static void main(String[] args) {
		// Creating two objects
		JavaVariables person1 = new JavaVariables("Alice", 25);
		JavaVariables person2 = new JavaVariables("Bob", 30);

        // Display info for both
        person1.displayInfo();
        person2.displayInfo();

        // Accessing class variable
        System.out.println("Total number of objects created: " + JavaVariables.totalObjects);

	}

}
