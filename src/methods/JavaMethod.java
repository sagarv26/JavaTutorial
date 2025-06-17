package methods;

public class JavaMethod {
	
	// 1. Static method (no return, no parameters)
    public static void sayHello() {
        System.out.println("Hello! This is a static method.");
    }
    
    // 2. Static method (with parameters)
    public static void greetUser(String name) {
        System.out.println("Hi, " + name + "! Welcome to Java.");
    }
    
    // 3. Static method (with return)
    public static int add(int a, int b) {
        return a + b;
    }
    
    // 4. Instance method (non-static, with return)
    public double divide(int x, int y) {
        if (y != 0) {
            return (double) x / y;
        } else {
            return 0;
        }
    }
    
    // 5. Instance method (no return, with parameters)
    public void printMessage(String message) {
        System.out.println("Message: " + message);
    }
    
    // 6. Method overloading
    public void display() {
        System.out.println("Display method with no parameters");
    }
    public void display(String text) {
        System.out.println("Display method with text: " + text);
    }
    
    
    public static void main(String[] args) {
        
    	// Calling static methods
        sayHello();                         // No parameters
        greetUser("Viewers");                // With parameters
        int sum = add(10, 20);             
        System.out.println("Sum: " + sum); // With return value
        
        // Creating object for instance methods
        JavaMethod obj = new JavaMethod();
        double result = obj.divide(20, 4);
        
        System.out.println("Division Result: " + result);
        obj.printMessage("Java is powerful!");
        
        // Method Overloading
        obj.display();              
        obj.display("Method Overloading in action!");
    }

}
