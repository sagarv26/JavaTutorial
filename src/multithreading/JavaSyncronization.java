package multithreading;

class BankAccount {
	private int balance = 1000;

	public void withdraw(int amount) {

		synchronized(this) {
			if(balance >= amount) {
				System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
				try {
					Thread.sleep(100); // simulate time taken
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				balance -= amount;
				System.out.println(Thread.currentThread().getName() + " completed withdrawal. Balance: " + balance);
			} else {
				System.out.println("Insufficient funds for " + Thread.currentThread().getName());
			}
		}

	}
}

public class JavaSyncronization {
	public static void main(String[] args) {
		BankAccount account = new BankAccount();

		Thread t1 = new Thread(() -> account.withdraw(700), "User1");
		Thread t2 = new Thread(() -> account.withdraw(500), "User2");

		t2.start();
		t1.start();
		
	}
}