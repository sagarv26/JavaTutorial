package flowControl;

import java.util.Scanner;

public class JavaConditionalStatements {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input marks
        System.out.print("Enter marks (0 to 100): ");
        int marks = scanner.nextInt();

        // 1. if condition (validity check)
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks entered!");
            return;
        }

        // 2. if-else condition (pass/fail)
        if (marks >= 35) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }

        // 3. if-else-if ladder for grade
        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 75) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 45) {
            grade = 'D';
        } else if (marks >= 35) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        // 4. switch for remarks based on grade
        switch (grade) {
            case 'A':
                System.out.println("Remark: Excellent");
                break;
            case 'B':
                System.out.println("Remark: Very Good");
                break;
            case 'C':
                System.out.println("Remark: Good");
                break;
            case 'D':
                System.out.println("Remark: Average");
                break;
            case 'E':
                System.out.println("Remark: Just Passed");
                break;
            default:
                System.out.println("Remark: Fail");
        }

        // 5. Ternary operator for scholar label
        String label = (marks >= 90) ? "Scholar" : "Regular";
        System.out.println("Student Type: " + label);

	}

}
