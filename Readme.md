# Java Tutorial
Welcome to this Java programming tutorial. In this repo, you'll learn everything from Java basics to advanced features like OOP, collections, and multi-threading.

Learning Java in 2025 is still a great decision -  it's one of the most widely used programming languages and forms the backbone of many enterprise and Android applications.


## What is Java?
[![What is Java?](http://img.youtube.com/vi/lp7E7JudXiY/0.jpg)](http://www.youtube.com/watch?v=lp7E7JudXiY)

Java is a high-level, object-oriented, and platform-independent programming language developed by Sun Microsystems in 1995 (now owned by Oracle Corporation).



### How Java Works
Java code goes through a compilation and interpretation process:
- You write Java code (.java file)
- Compiler converts it to bytecode (.class file)
- Java Virtual Machine (JVM) interprets bytecode and runs it on any device

📌 This makes Java platform-independent — the same code runs on Windows, Mac, Linux, etc., as long as there's a JVM.

#### Example Java Code
```java
public class Hello {
    public static void main(String[] args) {
    	  System.out.println("Hello, Java!");
    }
}
```

#### Explanation:
```java public class Hello``` → Defines a class named Hello

```java main(String[] args)``` → Entry point of the program

```java System.out.println()``` → Prints output to the console

#### Resources
##### Books:
- Head First Java by Kathy Sierra
- Effective Java by Joshua Bloch


##### Online Platforms:
- w3schools Java
- Codecademy
- LeetCode for Java coding practice


# Step-by-Step Guide to Learning Java from Scratch

## 1. Set Up Your Environment
Before writing any code, you need to set up your development environment.

### Install the JDK (Java Development Kit):
- [Download JDK from Oracle](https://www.oracle.com/java/technologies/javase-downloads.html)


### Install an IDE (Integrated Development Environment):
- [IntelliJ IDEA](https://www.jetbrains.com/idea/)
- [Eclipse](https://www.jetbrains.com/idea/)
- [VS Code with the Java extension](https://www.jetbrains.com/idea/)


## 2. Understand Java Basics
Start with these core concepts:

### Memory Management
[![Memory Management](http://img.youtube.com/vi/GnRyTqo6bTw/0.jpg)](http://www.youtube.com/watch?v=GnRyTqo6bTw)

Memory management in Java is a critical aspect of the language's runtime system, ensuring efficient use of memory resources and preventing memory leaks. Java memory management involves the automatic allocation and deallocation of objects, which is managed by the Java Virtual Machine (JVM). The JVM handles memory management automatically using its Garbage Collector (GC), which distinguishes it from languages like C or C++ where developers must manually manage memory.
The JVM (Java Virtual Machine) memory structure is organized into several key areas that manage the execution of Java programs. Understanding this memory layout is essential for optimizing Java performance and troubleshooting issues like memory leaks or OutOfMemoryError.

### Garbage Collection
[![Garbage Collection](http://img.youtube.com/vi/lbU625cLYsc/0.jpg)](http://www.youtube.com/watch?v=lbU625cLYsc)

Garbage Collection is the process by which Java automatically removes unused (unreachable) objects from memory (heap), so you don’t have to do it manually.

Java manages memory automatically using the Java Virtual Machine (JVM).

GC primarily manages:
- Young Generation (Minor GC)
- Old Generation (Major GC or Full GC)

How GC works:
- Tracks objects through references.
- If an object is no longer reachable (no live references), it becomes eligible for GC.

### Java Basic Syntax
[![Java Basic Syntax](http://img.youtube.com/vi/mv_2ttCxMng/0.jpg)](http://www.youtube.com/watch?v=mv_2ttCxMng)

### Java Main Method
[![Java Main Method](http://img.youtube.com/vi/MMFrMmpFD_k/0.jpg)](http://www.youtube.com/watch?v=MMFrMmpFD_k)

What is the main() Method in Java?
public static void main(String[] args)
It is the entry point of any standalone Java application. This is the method where the JVM begins execution of the program.

### Variables
[![Variables](http://img.youtube.com/vi/mY17oDiED3A/0.jpg)](http://www.youtube.com/watch?v=mY17oDiED3A)

In Java, variables are containers used to store data values. Each variable in Java has a type, which determines what kind of data it can hold.

Types of Variables in Java

- Local Variables
- Instance Variables (Non-static fields)
- Class Variables (Static fields)

Java Data Types
A data type is a classification of the type of data that a variable can hold in computer programming.

Data types in Java are classified into two types:
- Primitive - which include integer, character, boolean, and floating Point type values.
- Non-primitive - which include Classes, Interfaces, Object type and Array

### Scope of Variables in Java
[![Scope of Variables](http://img.youtube.com/vi/NRzS1MY3sIg/0.jpg)](http://www.youtube.com/watch?v=NRzS1MY3sIg)

The scope of variables is the part of the program where the variable is accessible. Like C/C++, in Java, all identifiers are lexically (or statically) scoped, i.e., scope of a variable can be determined at compile time and independent of the function call stack. In this article, we will learn about Java Scope Variables.

Java Scope Rules can be covered under the following categories. 
- Instance Variables
- Static Variables
- Local Variables
- Parameter Scope
- Block Scope

### Java Operators
[![Java Operators](http://img.youtube.com/vi/hDHohiT0vu0/0.jpg)](http://www.youtube.com/watch?v=hDHohiT0vu0)

In Java, operators are special symbols used to perform operations on variables and values. Java provides a rich set of operators grouped into several categories.

### User Input in Java
[![User Input in Java](http://img.youtube.com/vi/aHoTALikgzk/0.jpg)](http://www.youtube.com/watch?v=aHoTALikgzk)

In Java, there are multiple ways to get user input, depending on the use case and environment
The scanner class can handle input from different places, like as we are typing at the console, reading from a file, or working with data streams. This class was introduced in Java 5. Before that, we used the BufferedReader class (introduced in Java 1.1). As a beginner, it's better to use the Scanner class.

#### Scanner 
- Import the Scanner class using import java.util.Scanner;
- Create the Scanner object and connect Scanner with System.in by passing it as an argument i.e., Scanner sc = new Scanner(System.in);
- When we want to ask the user for input, first print a prompt message so they know what to enter

#### BufferedReader
Faster than Scanner for large input, but requires exception handling and manual parsing.

#### Console
Only works in the actual terminal/console, not in most IDEs.

#### Command Line Arguments
Takes input when the program is run.


## 3. Control Flow
[![Control Flow](http://img.youtube.com/vi/8uGfolkWDmc/0.jpg)](http://www.youtube.com/watch?v=8uGfolkWDmc)

### Conditional Statement

In Java, conditional statements control the flow of execution based on whether a condition is true or false. They allow your program to make decisions. i.e. if a certain condition is true then a block of statements is executed otherwise not.
Types of Conditional Statements in Java
- if Statement
- if-else Statement
- if-else if-else Ladder
- switch Statement
- Ternary Operator (Shorthand if-else)

### Loops
In Java, loops are used to repeat a block of code multiple times based on a condition. They're essential for tasks like iterating through arrays, performing calculations repeatedly, or automating repetitive actions.
Types of Loops in Java
- for loop
- While loop
- do-while loop

## 4. Methods
[![Methods](http://img.youtube.com/vi/-mjhWW5z6cM/0.jpg)](http://www.youtube.com/watch?v=-mjhWW5z6cM)

In Java, methods are blocks of code that perform a specific task and can be called (invoked) at any point in a program simply by utilizing the method's name. They help in code reuse, modularity, and readability.
In Java we call functions as methods, because here the methods can be written only inside class but not outside the class as in C++. Methods are used to tell the behaviour of the object.

### Types of Methods

- Predefined (Built-in): Provided by Java (e.g., System.out.println())
- User-defined: Created by the programmer
- Static: Belongs to class, not object (no object needed)
- Instance: Needs object of the class to be called
- Void: Returns nothing
- Return type methods: Returns a value (e.g., int, String)

## 5. Strings
[![Strings](http://img.youtube.com/vi/Uk1kROHV8zE/0.jpg)](http://www.youtube.com/watch?v=Uk1kROHV8zE)

A String in Java is a sequence of characters. Strings are immutable (cannot be changed once created), and Java treats them as objects of the String class in java.lang package
### Creating Strings

#### Using String Literals (Recommended)

```String name = "SWE";```

- Stored in the String Pool
- Saves memory by reusing existing objects

#### Using new Keyword

```String city = new String("Mumbai");```

- Stored in Heap memory
- Creates a new object every time, even if the content is the same

### String Memory Allocation
In Java, strings are treated differently in memory based on how they are created. This is crucial for performance and understanding immutability, object reuse, and memory optimization.

#### Java String Pool (String Constant Pool)
- Located in the Method Area of JVM memory.
- Maintains a pool of unique string literals.
- Saves memory by reusing strings with the same value.


### StringBuffer and StringBuilder
[![StringBuffer and StringBuilder](http://img.youtube.com/vi/2tDUAIYLPK0/0.jpg)](http://www.youtube.com/watch?v=2tDUAIYLPK0)

StringBuffer and StringBuilder are Java classes used to create mutable (changeable) sequences of characters.

Unlike String (which is immutable), you can modify the contents of StringBuffer and StringBuilder objects without creating new objects.

#### StringBuffer
StringBuffer is a thread-safe, mutable sequence of characters. All methods are synchronized (safe for use by multiple threads).
```
public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");              // Adds text
        sb.insert(4, " Language");              // Inserts at index 4
        sb.replace(0, 4, "Core");               // Replaces "Java" with "Core"
        sb.delete(4, 13);                       // Deletes " Language"

        System.out.println("Result: " + sb);    // Output: CoreProgramming
    }
}
```

#### StringBuilder
StringBuilder is not thread-safe, but it is faster. It is ideal when you are working in a single-threaded environment.
```
public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" World");     // Add text at the end
        sb.reverse();            // Reverse the string

        System.out.println("Reversed: " + sb);  // Output: dlroW olleH
    }
}
```

## 6. Arrays
[![Arrays](http://img.youtube.com/vi/6ppOaD9t-rk/0.jpg)](http://www.youtube.com/watch?v=M6ppOaD9t-rk)

An array in Java is a container object that holds a fixed number of elements of the same data type. It stores elements in a contiguous memory location, and you can access them using index numbers.

## 7. Java OOPs
[![OOPs](http://img.youtube.com/vi/JV1i9xhYTUM/0.jpg)](http://www.youtube.com/watch?v=JV1i9xhYTUM)

Java is a purely object-oriented language (except for primitive types) and follows four main principles of OOP:
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

Java Object-Oriented Programming (OOPs) is a fundamental concept in Java that every developer must understand. It allows developers to structure code using classes and objects, making it more modular, reusable, and scalable.

The core idea of OOPs is to bind data and the functions that operate on it, preventing unauthorized access from other parts of the code. Java strictly follows the DRY (Don't Repeat Yourself) Principle, ensuring that common logic is written once (e.g., in parent classes or utility methods) and reused throughout the application.

### Inheritance
[![Inheritance](http://img.youtube.com/vi/kcaFURLTtEg/0.jpg)](http://www.youtube.com/watch?v=kcaFURLTtEg))

Inheritance is one of the core concepts of Object-Oriented Programming (OOP) in Java. It allows a class (child/subclass) to inherit properties and behaviors (methods) from another class (parent/superclass).

### Encapsulation
[![Encapsulation](http://img.youtube.com/vi/_jK5HR811sE/0.jpg)](http://www.youtube.com/watch?v=_jK5HR811sE)

Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) principles in Java. It is the process of wrapping data (variables) and the code (methods) that operate on the data into a single unit called a class. Think of it as putting the data and the methods into a capsule (hence the name encapsulation).
This allows the internal representation of an object to be hidden from the outside world. Instead of accessing fields directly, other classes interact with them through getter and setter methods.

### Polymorphism
[![Polymorphism](http://img.youtube.com/vi/r4Cul7QZn0g0.jpg)](http://www.youtube.com/watch?v=r4Cul7QZn0g)

In Java, polymorphism allows a single action (like calling a method) to behave differently based on the object that is performing the action.

### Abstraction
[![Abstraction](http://img.youtube.com/vi/D1MG2N-vbQY/0.jpg)](http://www.youtube.com/watch?v=D1MG2N-vbQY)

Abstraction is the process of hiding internal implementation details and showing only the essential features of an object.

### Casting in Java
[![Casting](http://img.youtube.com/vi/xLyWVcI67Ao/0.jpg)](http://www.youtube.com/watch?v=xLyWVcI67Ao)

Casting is the process of converting a variable from one type to another.
Java supports two main types of casting:
- Primitive Type Casting
- Reference Type Casting (also called Object Casting)

### Object Class
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

Object class is the super class of all the classes in java. The Object class reference can be given to any child object or any class object. Every class in the Java system is a descendent (direct or indirect) of the Object class
Every class you create in Java automatically extends Object (if no other superclass is specified).

### Java Collections
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

The Java Collection Framework (JCF) is a unified architecture for storing and manipulating groups of objects.
It provides ready-to-use classes and interfaces to handle data structures like lists, sets, queues, maps, etc.

- Package:
java.util.*

#### Why Use Collection Framework?
Let’s say you're building an e-commerce site. You'll need a cart that grows dynamically, a set of unique product categories, and maybe a queue for processing orders. Collections like ArrayList, HashSet, and PriorityQueue make all this easy.

### Error Handling
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

In Java, error handling means catching and responding to problems during your program’s execution - like a file not found, invalid input, or insufficient balance in a bank account.

Understanding error handling in Java is essential for building reliable, robust, and user-friendly applications.

Error handling is the process of responding to unexpected events (errors) that occur during program execution, without crashing the program.
Java uses a structured way of doing this using keywords like try, catch, finally, throw, and throws.


### Multithreading
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

Multithreading is the process of executing multiple threads simultaneously to perform tasks concurrently.

Multithreading allows a program to perform multiple tasks at the same time by running multiple threads in parallel.

Think of a thread as a lightweight process. By using multiple threads, you can make your applications faster, more responsive, and more efficient.


### Thread Synchronization
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

Thread Synchronization is a mechanism to control the access of multiple threads to shared resources.

When two or more threads try to access a shared resource simultaneously, there can be inconsistent behavior or data corruption. To prevent this, we use synchronization to make sure only one thread can access the critical section at a time.

### Thread safety
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

Thread safety means that a class or method behaves correctly when accessed by multiple threads simultaneously. A thread-safe component prevents unintended interactions, even if several threads operate on the same data.

Thread safety is crucial in multithreaded Java programs to avoid issues like data corruption, race conditions, and inconsistent behavior.

### Singleton
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

A Singleton is a design pattern that ensures only one instance of a class is created and provides a global access point to that instance.

You use Singleton when you only need one object - like a logger, a database connection pool, or a configuration manager. Imagine having multiple connections trying to manage a single printer - chaos!


### Lazy Initializationl
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

Lazy Initialization means delaying the creation (or initialization) of an object or resource until it is actually needed - instead of doing it during program start-up.

### Wrapper Classes
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

In Java, wrapper classes are object representations of primitive data types.

Java has eight primitive types:
- byte, short, int, long, float, double, char, boolean

### Regex
- [Watch Here:](https://youtu.be/MC8WvbTtOwY)

Regex (Regular Expression) is a pattern-matching technique used to search, manipulate, and validate strings based on specific patterns.

In Java, regex is provided via the java.util.regex package, In Java, Regex is powered by two core classes: Pattern to define the rules, and Matcher to apply those rules to user input..

