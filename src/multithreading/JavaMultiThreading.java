package multithreading;

class FoodOrder extends Thread {
	private String customerName;

	public FoodOrder(String customerName) {
		this.customerName = customerName;
	}

	@Override
	public void run() {
		System.out.println(customerName + " placed an order on thread: " + Thread.currentThread().getName());

		try {
			// Simulating time taken to cook and pack
			Thread.sleep((int)(Math.random() * 3000 + 1000));
		} catch (InterruptedException e) {
			System.out.println(customerName + "'s order was interrupted!");
		}

		System.out.println("Order ready for " + customerName + " ");
	}
}


public class JavaMultiThreading {
	public static void main(String[] args) {
		System.out.println("Restaurant is open");

		FoodOrder order1 = new FoodOrder("Alice");
		FoodOrder order2 = new FoodOrder("Bob");
		FoodOrder order3 = new FoodOrder("Charlie");
		FoodOrder order4 = new FoodOrder("Diana");

		order1.start();
		order2.start();
		order3.start();
		order4.start();

		System.out.println("All orders are being processed concurrently... ");
	}

}
