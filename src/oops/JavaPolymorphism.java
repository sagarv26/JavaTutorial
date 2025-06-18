package oops;

//Parent class
class Payment {
	public void makePayment(double amount) {
		System.out.println("Processing generic payment of " + amount);
	}
}

class CreditCard extends Payment {
	@Override
	public void makePayment(double amount) {
		System.out.println("Paid " + amount + " using Credit Card.");
	}
}

class DebitCard extends Payment {
	@Override
	public void makePayment(double amount) {
		System.out.println("Paid " + amount + " using Debit Card.");
	}
}

class UPI extends Payment {
	@Override
	public void makePayment(double amount) {
		System.out.println("Paid " + amount + " using UPI (e.g., Google Pay, PhonePe).");
	}
}

class Cash extends Payment {
	@Override
	public void makePayment(double amount) {
		System.out.println("Paid " + amount + " using Cash.");
	}
}


public class JavaPolymorphism {
	public static void main(String[] args) {
		Payment payment;

		// Paying with Credit Card
		payment = new CreditCard();
		payment.makePayment(1200.50);

		// Paying with UPI
		payment = new UPI();
		payment.makePayment(599.00);

		// Paying with Debit Card
		payment = new DebitCard();
		payment.makePayment(899.75);

		// Paying with Cash
		payment = new Cash();
		payment.makePayment(300.00);
	}

}
