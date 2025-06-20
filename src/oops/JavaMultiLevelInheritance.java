package oops;

class Animal {
	void eat() {
		System.out.println("eating...");
	}
}
class Dog extends Animal {
	void bark() {
		System.out.println("barking...");
	}
}
class Puppy extends Dog {
	void weep() {
		System.out.println("weeping...");
	}
}

public class JavaMultiLevelInheritance {
	public static void main(String args[]) {
		Puppy p = new Puppy();
		p.eat();
		p.bark();
		p.weep();
	}
}
