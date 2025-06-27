package exceptionHandling;

import java.util.Scanner;

//Custom Checked Exception
class InsufficientFundsException extends Exception {
 public InsufficientFundsException(String message) {
     super(message);
 }
}


public class BankAccount {
	private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialAmount) {
        this.accountHolder = accountHolder;
        this.balance = initialAmount;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= 0) {
            throw new IllegalArgumentException("Withdrawal amount must be positive.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance. Current balance: " + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }

    public void printAccountSummary() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Rahul Sharma", 5000);
        Scanner scanner = new Scanner(System.in);

        try {
            account.printAccountSummary();
            
            System.out.print("Enter amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter amount to withdraw: ");
            double withdrawalAmount = scanner.nextDouble();
            account.withdraw(withdrawalAmount);

        } catch (InsufficientFundsException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.err.println("Invalid input: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Something went wrong: " + e.getMessage());
        } finally {
            System.out.println("Transaction Complete.");
            account.printAccountSummary();
            scanner.close();
        }
    }

}
