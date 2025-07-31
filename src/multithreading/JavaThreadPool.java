package multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TicketBooking implements Runnable {
	private String customerName;

	public TicketBooking(String name) {
		this.customerName = name;
	}

	@Override
	public void run() {
		System.out.println(customerName + " is booking ticket using thread: " + Thread.currentThread().getName());
		try {
			Thread.sleep(2000); // Simulate time taken to book ticket
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Ticket booked for " + customerName);
	}
}


public class JavaThreadPool {
	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3); // 3 threads

		for(int i = 1; i <= 6; i++) {
			executor.execute(new TicketBooking("Customer " + i));
		}

		executor.shutdown(); // No more tasks will be accepted
	}

}
