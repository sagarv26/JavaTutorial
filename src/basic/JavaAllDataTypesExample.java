package basic;

public class JavaAllDataTypesExample {
	public static void main(String[] args) {
        // Primitive Data Types

        // Integer types
        byte b = 127;              // 1 byte: -128 to 127
        short s = 32000;           // 2 bytes: -32,768 to 32,767
        int i = 100000;            // 4 bytes: default integer type
        long l = 15000000000L;     // 8 bytes: large integers (note the 'L' suffix)

        // Floating point types
        float f = 5.75f;           // 4 bytes: single precision (note the 'f' suffix)
        double d = 19.99;          // 8 bytes: double precision, default for decimals

        // Character type
        char c = 'A';              // 2 bytes: single character, enclosed in single quotes

        // Boolean type
        boolean bool = true;       // 1 bit: true or false
        
        
        // Non-Primitive Data Types
        String name = "Java Developer"; // Object type (non-primitive)
        int[] numbers = {1, 2, 3, 4, 5}; // Array of integers

        // Output all variables
        System.out.println("=== Primitive Types ===");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + bool);

        System.out.println("\n=== Non-Primitive Types ===");
        System.out.println("String: " + name);
        System.out.print("Array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

}
