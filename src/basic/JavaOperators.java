package basic;

import java.util.Scanner;

public class JavaOperators {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Input marks for 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        int sub1 = scanner.nextInt();

        System.out.print("Enter marks for Subject 2: ");
        int sub2 = scanner.nextInt();

        System.out.print("Enter marks for Subject 3: ");
        int sub3 = scanner.nextInt();

        // Arithmetic operators
        int total = sub1 + sub2 + sub3;
        float average = total / 3.0f;

        // Relational + Logical operators
        boolean allPassed = (sub1 >= 35) && (sub2 >= 35) && (sub3 >= 35);

        // Unary operator (example)
        int subjects = 3;
        ++subjects;  // Now subjects = 4 (just to demonstrate)

        // Ternary operator
        String result = allPassed ? "Pass" : "Fail";

        // Assignment operator
        average += 0; // Just a formality to show `+=` usage

        // Output results
        System.out.println("\n--- Result ---");
        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);
        System.out.println("Result: " + result);
        
        
        
        
        /**
         *     
         * Assignment operators
         */
        int f = 7;
        System.out.println("\n\nAssignment operators");
        System.out.println("f += 3: " + (f += 3));
        System.out.println("f -= 2: " + (f -= 2));
        System.out.println("f *= 4: " + (f *= 4));
        System.out.println("f /= 3: " + (f /= 3));
        System.out.println("f %= 2: " + (f %= 2));
        System.out.println("f &= 0b1010: " + (f &= 0b1010));
        System.out.println("f |= 0b1100: " + (f |= 0b1100));
        System.out.println("f ^= 0b1010: " + (f ^= 0b1010));
        System.out.println("f <<= 2: " + (f <<= 2));
        System.out.println("f >>= 1: " + (f >>= 1));
        

        System.out.println("\nBitwise operators");
        int a = 5;   // 0101
        int b = 3;   // 0011
        System.out.println(a & b); 

        System.out.println("a<<1 : " + (a<<1)); //1010 
        System.out.println("a>>1 : " + (a>>1)); //0010

        

	}

}
