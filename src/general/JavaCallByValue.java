package general;

class Employee {
	String name;
}

public class JavaCallByValue {

	// Method for primitive
	public static void modifySalary(int salary) {
		salary = salary + 10000;
		System.out.println("Inside method - salary: " + salary); // Changed value
	}

	// Method for object
	public static void changeEmployeeName(Employee emp) {
		emp.name = "Alice";
		System.out.println("Inside method - name: " + emp.name); // Changed value
		System.out.println("Inside method - obj: " + emp);
	}

	// Method to reassign object reference (does NOT affect original)
	public static void reassignEmployee(Employee emp) {
		emp = new Employee(); // Reassigning reference
		emp.name = "Bob";
		System.out.println("Inside method - reassigned name: " + emp.name);
		System.out.println("Inside method - reassigned name: " + emp);
	}



	public static void main(String[] args) {
		String newLine = "\n";
		int salary = 50000;
		Employee employee = new Employee();
		employee.name = "John";

		modifySalary(salary);
		System.out.println("After method - salary: " + salary); // Still 50000
		System.out.println(newLine);

		changeEmployeeName(employee);
		System.out.println("Before method - obj: " + employee);
		System.out.println("After method - name: " + employee.name); // Now Alice
		System.out.println("After method - obj: " + employee);
		System.out.println(newLine);

		System.out.println("Before reassignment - obj: " + employee);
		reassignEmployee(employee);
		System.out.println("After reassignment - name: " + employee.name); // Still Alice, not Bob
		System.out.println("After reassignment - obj: " + employee);
	}

}





