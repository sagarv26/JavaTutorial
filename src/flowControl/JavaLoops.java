package flowControl;

import java.util.Scanner;

public class JavaLoops {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // for loop: Multiplication table
            System.out.print("Enter a number for multiplication table: ");
            int num = scanner.nextInt();
            System.out.println("Multiplication Table for " + num);
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
            }

            // while loop: Countdown
            System.out.print("\nEnter a number to countdown from: ");
            int count = scanner.nextInt();
            System.out.println("Countdown:");
            while (count >= 0) {
                System.out.print(count + " ");
                count--;
            }
            System.out.println();

            // Enhanced for loop: Print elements of an array
            int[] marks = {75, 85, 90, 65, 88};
            System.out.println("\nStudent Marks:");
            for (int mark : marks) {
                System.out.println(mark);
            }

            // do-while loop: Ask if user wants to repeat
            System.out.print("\nDo you want to run again? (y/n): ");
            choice = scanner.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');

        System.out.println("Program ended. Goodbye!");


	}

}
