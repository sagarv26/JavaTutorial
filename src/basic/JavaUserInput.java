package basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class JavaUserInput {

	public static void main(String[] args) {
		/**
		 * Scanner - The scanner class can handle input from different places, 
		 * like as we are typing at the console, 
		 * reading from a file, or working with data streams 
		 */
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();
        

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", Age: " + age);
		

		
        /**
         * 
         * BufferedReader - Faster than Scanner for large input, but requires exception handling and manual parsing.
         * 
         */
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		try {
			System.out.print("Enter your city: ");
	        String city = reader.readLine();
			System.out.print("Enter pin code: ");
	        int pin = Integer.parseInt(reader.readLine());

	        System.out.println("City: " + city + ", Pin: " + pin);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		/**
         * 
         * Console - Only works in the actual terminal/console, not in most IDEs
         * 
         *
		java.io.Console console = System.console();
        if (console != null) {
            String username = console.readLine("Enter username: ");
            char[] password = console.readPassword("Enter password: ");
            System.out.println("Welcome, " + username);
        } else {
            System.out.println("Console not available.");
        }
        */
        
		
        /**
         * 
         * Command Line Arguments - Takes input when the program is runs
         * 
         *
        if (args.length >= 2) {
            String input1 = args[0];
            int input2 = Integer.parseInt(args[1]);
            System.out.println("Input 1: " + input1 + ", Input 2: " + input2);
        } else {
            System.out.println("Please pass input as arguments.");
        }
        */


	}

}
