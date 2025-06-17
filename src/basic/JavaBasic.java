package basic;

import java.util.Date;

public class JavaBasic {

	// Program begins with a call to main() method
    // main method is the entry point of a Java Program
	public static void main(String[] args) {
		
		
		// Prints "Hello World" to the console
		System.out.println("Hello World");
		
		/**
		 * Comments in Java
		 */
		
		// This is a single-line comment
		
		/* This is
		   a multi-line comment */
		
		/** This is a doc comment */
		
		
		/**
		 * 
		 *  Terminology
		 * 	Class
		 * 	Object
		 * 	Method
		 * 	Statement
		 * 
		 */
		
		System.out.println("Hello World"); // valid syntax 

		//system.out.println("Hello World"); // invalid syntax because of the first letter of System keyword is always uppercase. 
		
		/**
		 * 
		 * 
		 *  Naming Convention
		 * 
		 *	class MyJavaProgram      // valid syntax 
		 *	class 1Program           // invalid syntax 
		 *	class My1Program         // valid syntax 			
		 *	class $Program           // valid syntax, but discouraged 			
		 *	class My$Program         // valid syntax, but discouraged (inner class Program inside the class My) 			
		 *	class myJavaProgram      // valid syntax, but discouraged
		 *
		 *
		 *	public void employeeRecords()    // valid syntax 
		 * 	public void EmployeeRecords()    // valid syntax, but discouraged
		 * 
		 * 	Legal identifiers: MinNumber, total, ak74, hello_world, $amount, _under_value
		 *	Illegal identifiers: 74ak, -amount
		 *
		 */
		
		// Import
		Date currentDate = new Date();
		System.out.println("currentDate: "+currentDate);

	}
	
	// Method to print message
    public void printMessage() {
        System.out.println("Hello, World!");
    }

}
