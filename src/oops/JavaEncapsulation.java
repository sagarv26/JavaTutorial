package oops;

import java.util.Scanner;

class BankAccount {
	private String owner;
	private double balance;

	// Constructor
	public BankAccount(String owner) {
		this.owner = owner;
		this.balance = 0.0;
	}

	// Getter for balance
	public double getBalance() {
		return balance;
	}

	// Deposit method with validation
	public void deposit(double amount) {
		if (amount > 0) {
			balance += amount;
			System.out.println("Deposited: " + amount);
		} else {
			System.out.println("Invalid deposit amount!");
		}
	}

	// Withdraw method with validation
	public void withdraw(double amount) {
		if (amount > 0 && amount <= balance) {
			balance -= amount;
			System.out.println("Withdrew: " + amount);
		} else {
			System.out.println("Invalid or insufficient balance.");
		}
	}

	public void showDetails() {
		System.out.println("Account Holder: " + owner);
		System.out.println("Current Balance: " + balance);
	}
}


public class JavaEncapsulation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Step 1: Create account
		System.out.print("Enter account holder's name: ");
		String name = sc.nextLine();
		BankAccount account = new BankAccount(name);

		// Step 2: Interaction menu
		while (true) {
			System.out.println("\nMenu:");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Show Balance");
			System.out.println("4. Exit");
			System.out.print("Choose an option: ");

			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				System.out.print("Enter deposit amount: ");
				double dep = sc.nextDouble();
				account.deposit(dep);
				break;
			case 2:
				System.out.print("Enter withdrawal amount: ");
				double wit = sc.nextDouble();
				account.withdraw(wit);
				break;
			case 3:
				account.showDetails();
				break;
			case 4:
				System.out.println("Thank you for banking with us!");
				return;
			default:
				System.out.println("Invalid choice.");
			}
		}
	}

}
