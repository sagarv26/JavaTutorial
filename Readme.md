# Java Tutorial
Welcome to this Java programming tutorial. In this repo, you'll learn everything from Java basics to advanced features like OOP, collections, and multi-threading.

Learning Java in 2025 is still a great decision -  it's one of the most widely used programming languages and forms the backbone of many enterprise and Android applications.


## What is Java?
[▶️ Watch here: What is Java?](https://youtu.be/lp7E7JudXiY?si=9ZO7JtFvYCClyjRU)
<a href="http://www.youtube.com/watch?feature=player_embedded&v=lp7E7JudXiY?si=9ZO7JtFvYCClyjRU
" target="_blank"><img src="http://img.youtube.com/vilp7E7JudXiY?si=9ZO7JtFvYCClyjRU/0.jpg" 
alt="IMAGE ALT TEXT HERE" width="240" height="180" border="10" /></a>
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
- [Youtube Link](https://youtu.be/GnRyTqo6bTw?si=nxxY0dHonsLd_-wc)

Memory management in Java is a critical aspect of the language's runtime system, ensuring efficient use of memory resources and preventing memory leaks. Java memory management involves the automatic allocation and deallocation of objects, which is managed by the Java Virtual Machine (JVM). The JVM handles memory management automatically using its Garbage Collector (GC), which distinguishes it from languages like C or C++ where developers must manually manage memory.
The JVM (Java Virtual Machine) memory structure is organized into several key areas that manage the execution of Java programs. Understanding this memory layout is essential for optimizing Java performance and troubleshooting issues like memory leaks or OutOfMemoryError.

### Garbage Collection
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

Garbage Collection is the process by which Java automatically removes unused (unreachable) objects from memory (heap), so you don’t have to do it manually.

Java manages memory automatically using the Java Virtual Machine (JVM).

GC primarily manages:
- Young Generation (Minor GC)
- Old Generation (Major GC or Full GC)

How GC works:
- Tracks objects through references.
- If an object is no longer reachable (no live references), it becomes eligible for GC.

### Java Basic Syntax
- [Youtube Link](https://youtu.be/mv_2ttCxMng?si=KJLcU3ui75KSF_JP)

### Java Main Method
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

What is the main() Method in Java?
public static void main(String[] args)
It is the entry point of any standalone Java application. This is the method where the JVM begins execution of the program.

### Variables
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

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
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

The scope of variables is the part of the program where the variable is accessible. Like C/C++, in Java, all identifiers are lexically (or statically) scoped, i.e., scope of a variable can be determined at compile time and independent of the function call stack. In this article, we will learn about Java Scope Variables.

Java Scope Rules can be covered under the following categories. 
- Instance Variables
- Static Variables
- Local Variables
- Parameter Scope
- Block Scope

### Java Operators
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

In Java, operators are special symbols used to perform operations on variables and values. Java provides a rich set of operators grouped into several categories.

### User Input in Java
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

In Java, there are multiple ways to get user input, depending on the use case and environment
The scanner class can handle input from different places, like as we are typing at the console, reading from a file, or working with data streams. This class was introduced in Java 5. Before that, we used the BufferedReader class (introduced in Java 1.1). As a beginner, it's better to use the Scanner class.


## 3. Control Flow
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

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
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

In Java, methods are blocks of code that perform a specific task and can be called (invoked) at any point in a program simply by utilizing the method's name. They help in code reuse, modularity, and readability.
In Java we call functions as methods, because here the methods can be written only inside class but not outside the class as in C++. Methods are used to tell the behaviour of the object.


## 5. Strings
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

A String in Java is a sequence of characters. Strings are immutable (cannot be changed once created), and Java treats them as objects of the String class in java.lang package

### StringBuffer and StringBuilder
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

StringBuffer and StringBuilder are Java classes used to create mutable (changeable) sequences of characters.

Unlike String (which is immutable), you can modify the contents of StringBuffer and StringBuilder objects without creating new objects.

## 6. Arrays
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

An array in Java is a container object that holds a fixed number of elements of the same data type. It stores elements in a contiguous memory location, and you can access them using index numbers.

## 7. Java OOPs
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

Java is a purely object-oriented language (except for primitive types) and follows four main principles of OOP:
- Encapsulation
- Abstraction
- Inheritance
- Polymorphism

Java Object-Oriented Programming (OOPs) is a fundamental concept in Java that every developer must understand. It allows developers to structure code using classes and objects, making it more modular, reusable, and scalable.

The core idea of OOPs is to bind data and the functions that operate on it, preventing unauthorized access from other parts of the code. Java strictly follows the DRY (Don't Repeat Yourself) Principle, ensuring that common logic is written once (e.g., in parent classes or utility methods) and reused throughout the application.

### Inheritance
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

Inheritance is one of the core concepts of Object-Oriented Programming (OOP) in Java. It allows a class (child/subclass) to inherit properties and behaviors (methods) from another class (parent/superclass).

### Encapsulation
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

Encapsulation is one of the four fundamental Object-Oriented Programming (OOP) principles in Java. It is the process of wrapping data (variables) and the code (methods) that operate on the data into a single unit called a class. Think of it as putting the data and the methods into a capsule (hence the name encapsulation).
This allows the internal representation of an object to be hidden from the outside world. Instead of accessing fields directly, other classes interact with them through getter and setter methods.

### Polymorphism
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

In Java, polymorphism allows a single action (like calling a method) to behave differently based on the object that is performing the action.

### Abstraction
- [Youtube Link](https://youtu.be/lbU625cLYsc?si=yAk1hZV1E1JjBkag)

Abstraction is the process of hiding internal implementation details and showing only the essential features of an object.

