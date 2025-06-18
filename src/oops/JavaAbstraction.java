package oops;

interface ATMOperations {
	void authenticate(String cardNumber, int pin);
	void withdraw(double amount);
	void deposit(double amount);
	void checkBalance();
}



class SimpleBankAccount {
	private String cardNumber;
	private int pin;
	private double balance;

	public SimpleBankAccount(String cardNumber, int pin, double balance) {
		this.cardNumber = cardNumber;
		this.pin = pin;
		this.balance = balance;
	}

	public boolean verifyPin(int inputPin) {
		return this.pin == inputPin;
	}

	public void deposit(double amount) {
		balance += amount;
		System.out.println("Rupees" + amount + " deposited successfully.");
	}

	public void withdraw(double amount) {
		if (amount <= balance) {
			balance -= amount;
			System.out.println("Rupees" + amount + " withdrawn successfully.");
		} else {
			System.out.println("Insufficient balance.");
		}
	}

	public double getBalance() {
		return balance;
	}

	public String getCardNumber() {
		return cardNumber;
	}
}

class SimpleATM implements ATMOperations {
	private SimpleBankAccount currentAccount;

	@Override
	public void authenticate(String cardNumber, int pin) {
		// In real life, this would involve database lookup
		if (cardNumber.equals("1234-5678-9876-5432")) {
			SimpleBankAccount account = new SimpleBankAccount(cardNumber, 1234, 10000.0);
			if (account.verifyPin(pin)) {
				currentAccount = account;
				System.out.println("Authentication successful.");
			} else {
				System.out.println("Incorrect PIN.");
			}
		} else {
			System.out.println("Card not recognized.");
		}
	}

	@Override
	public void withdraw(double amount) {
		if (currentAccount != null) {
			currentAccount.withdraw(amount);
		} else {
			System.out.println("User not authenticated.");
		}
	}

	@Override
	public void deposit(double amount) {
		if (currentAccount != null) {
			currentAccount.deposit(amount);
		} else {
			System.out.println("User not authenticated.");
		}
	}

	@Override
	public void checkBalance() {
		if (currentAccount != null) {
			System.out.println("Your current balance is Rupees" + currentAccount.getBalance());
		} else {
			System.out.println("User not authenticated.");
		}
	}
}

public class JavaAbstraction {
	public static void main(String[] args) {
		ATMOperations atm = new SimpleATM();

		atm.authenticate("1234-5678-9876-5432", 1234); // Authenticate
		atm.checkBalance();                           // Check balance
		atm.withdraw(2500);                           // Withdraw money
		atm.deposit(1000);                            // Deposit money
		atm.checkBalance();                           // Check new balance
	}
}

