package multithreading;

import java.util.concurrent.locks.ReentrantLock;

class Inventory {
	private int stock = 100;
	private final ReentrantLock lock = new ReentrantLock();

	public void purchaseItem(String threadName, int quantity) {
		lock.lock(); // Acquire the lock
		try {
			System.out.println(threadName + " attempting to purchase " + quantity + " items.");
			if (stock >= quantity) {
				stock -= quantity;
				System.out.println(threadName + " purchased " + quantity + " items. Stock left: " + stock);
			} else {
				System.out.println(threadName + " failed to purchase. Not enough stock!");
			}
		} finally {
			lock.unlock(); // Always release lock in finally
		}
	}
}


public class JavaReentrantLock {
	public static void main(String[] args) {
		Inventory inventory = new Inventory();

		Runnable buyer = () -> {
			String threadName = Thread.currentThread().getName();
			inventory.purchaseItem(threadName, 30);
		};

		Thread t1 = new Thread(buyer, "User-1");
		Thread t2 = new Thread(buyer, "User-2");
		Thread t3 = new Thread(buyer, "User-3");
		Thread t4 = new Thread(buyer, "User-4");

		t1.start(); t2.start(); t3.start(); t4.start();
	}

}
