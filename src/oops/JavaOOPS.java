package oops;

//Parent class (Abstraction + Inheritance)
abstract class Account {
	private String accountHolder;  // Encapsulation
	private double balance;

	// Constructor
	public Account(String name, double initialBalance) {
		this.accountHolder = name;
		this.balance = initialBalance;
	}

	// Getter for balance (Encapsulation)
	public double getBalance() {
		return balance;
	}

	// Abstract method (Abstraction)
	public abstract void deposit(double amount);

	public void displayAccountInfo() {
		System.out.println("Account Holder: " + accountHolder);
		System.out.println("Balance: " + getBalance());
	}

	// Protected method to update balance
	protected void updateBalance(double amount) {
		balance += amount;
	}
}

//Child class (Inheritance + Polymorphism)
class SavingsAccount extends Account {
	public SavingsAccount(String name, double initialBalance) {
		super(name, initialBalance);
	}

	// Overriding abstract method (Polymorphism)
	public void deposit(double amount) {
		if (amount > 0) {
			updateBalance(amount);
			System.out.println("Deposited " + amount + " into savings account.");
		}
	}
}

public class JavaOOPS {
	public static void main(String[] args) {
		// Creating object (Object + Constructor)
		SavingsAccount acc = new SavingsAccount("Alice", 1000);

		acc.displayAccountInfo();   // Inherited method
		acc.deposit(500);           // Overridden method
		System.out.println("Updated Balance: " + acc.getBalance());
	}
}

